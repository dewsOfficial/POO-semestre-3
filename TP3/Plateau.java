public class Plateau {
    public final int hauteur, largeur, nbMines;
    
    private final boolean[][] mines;
        /*indique où sont les mines sur le plateau*/
    private final int[][] etats;
        /*indique dans quel état est chaque case
          (cachée, révélée, avec/sans drapeau)*/
    private final int[][] adja;
        /*indique le nombre de mines adjacentes 
          à chaque case*/

    private int casesRestantes;
    private boolean perdu;
    private int nbDrapeaux;
    
    private static final int[][] VOISINS = {{0,1},{-1,1},{-1,0},{-1,-1},{0,-1},{1,-1},{1,0},{1,1}};

    //Liste des actions
    public static final int REVELER = 0, POSER = 1, ENLEVER = 2;

    //Liste des états
    public static final int CACHEE = 0, REVELEE = 1, DRAPEAU = 2;
    
    public Plateau(int hauteur, int largeur, int nbMines){
	this.hauteur = hauteur; this.largeur = largeur; this.nbMines = nbMines;
	mines = new boolean[hauteur][largeur];
	etats = new int[hauteur][largeur];
	adja = new int[hauteur][largeur];

	casesRestantes = hauteur*largeur - nbMines;
	nbDrapeaux = 0;
	perdu = false;
	
	//On suppose que nbMines n'est pas > hauteur*largeur
	ajouteMinesAlea();

	calculeAdjacence();
    }

    private void ajouteMinesAlea(){
	int[] randomPerm = new int[hauteur*largeur];
	for(int i = 0; i<hauteur*largeur; i++)
	    randomPerm[i]=i;
	for(int i = 0; i<hauteur*largeur; i++){
	    int j =i+(int)(Math.random()*(hauteur*largeur-i));
	    int tmp = randomPerm[i];
	    randomPerm[i]=randomPerm[j];
	    randomPerm[j]=tmp;
	}
	for(int i = 0; i<nbMines; i++)
	    mines[randomPerm[i]/largeur][randomPerm[i]%largeur] = true;
    }

    private void calculeAdjacence(){
	for(int h = 0; h < hauteur; h++)
	    for(int l = 0; l < largeur; l++)
		if(mines[h][l])
		   for(int i = 0; i<8; i++){
		       int hi = h+VOISINS[i][0];
		       int li = l+VOISINS[i][1];
		       if(caseValide(hi,li))
			   adja[hi][li]++;
		   }
    }

    private boolean caseValide(int h, int l){
	return (h>=0 && h<hauteur && l>=0 && l<largeur);
    }
    
    public boolean agir(int[] action){
	if(!actionValide(action))
	    return false;
	int type = action[0], h = action[1], l = action[2];
	
	switch(type){
	case REVELER :
	    if(etats[h][l]==CACHEE){
		reveler(h,l);
		return true;
	    }
	    else
		return false;
	case POSER :
	    if(etats[h][l]==CACHEE){
		etats[h][l]=DRAPEAU;
		nbDrapeaux++;
		return true;
	    }
	    else
		return false;
	case ENLEVER :
	    if(etats[h][l]==DRAPEAU){
	        etats[h][l]=CACHEE;
		nbDrapeaux--;
		return true;
	    }
	    else
		return false;
	}
	
	return false;
    }

    private void reveler(int h, int l){
        if(mines[h][l]){
	    perdu = true;
	    return;
	}

	casesRestantes--;
	etats[h][l] = REVELEE;
	
	if(adja[h][l]==0)
	    for(int i = 0; i<8; i++){
		int hi = h + VOISINS[i][0];
		int li = l + VOISINS[i][1];
		if(caseValide(hi,li)&&etats[hi][li]==CACHEE)
		    reveler(hi,li);
	    }
    }

    private boolean actionValide(int[] action){
	if(action==null || action.length!=3)
	    return false;
	int type = action[0], h = action[1], l = action[2];
	return ((type==REVELER||type==ENLEVER||type==POSER)&&caseValide(h,l));
    }

    public boolean jeuFini(){
        return ((casesRestantes == 0)||perdu);
    }

    public boolean jeuGagne(){
        return (!perdu);
    }

    public String affichage(){
        String result = "****************\n"
	               +"*Mines/Drapeaux*\n"
	               +(nbMines>9 ? (nbMines>99? "* " : "*  ") : "*   " )
	               +nbMines
	               +     " / "+nbDrapeaux
	               +(nbDrapeaux>9 ? (nbDrapeaux>99? "" : " ") : "  " )
	               +  "    *\n"
                       +"****************\n";

	//Ajouter ABCDEF et 0123456 ...
	result = result + "  ";
	for(int l = 0; l < largeur; l++)
	    result = result + (l+1)%10;
	result = result + "\n";
	
	char row = 'A';
	
	for(int h = 0; h < hauteur; h++){
	    result = result + (char)(row+h)+" ";
	    for(int l = 0; l < largeur; l++)
		if(!perdu)
		    switch (etats[h][l]){
		    case CACHEE :
			result = result + " ";
			break;
		    case REVELEE :
			result = result + (adja[h][l]==0 ? ".": ""+adja[h][l]);
			break;
		    case DRAPEAU :
			result = result + "?";
			break;
		    }
		else
		    if (mines[h][l])
			result = result + "#";
		    else
			result = result + (adja[h][l]==0 ? ".": ""+adja[h][l]);
	    result= result + "\n";
	}
	
	return result;
    }
}
