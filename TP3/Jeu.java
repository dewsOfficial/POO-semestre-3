public class Jeu {
    private Joueur leJoueur;
    private Plateau lePlateau;
    
    public Jeu(Joueur leJoueur, Plateau lePlateau){
        this.leJoueur = leJoueur;
	this.lePlateau = lePlateau;
    }

    public boolean jouer(){
	while(!lePlateau.jeuFini()){
	    System.out.println(lePlateau.affichage());
	    System.out.println("Choisissez une action :");
	    int[] action = leJoueur.actionChoisie();
	    while(!lePlateau.agir(action)){
		System.out.println("Action interdite, recommencez :");
		action = leJoueur.actionChoisie();
	    }
	}

	System.out.println(lePlateau.affichage());
	
	return lePlateau.jeuGagne();
    }
}
