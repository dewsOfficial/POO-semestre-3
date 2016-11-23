public class Lanceur {
    public static void main (String[] args){
	System.out.println("Bonjour à ce jeu de démineur !");
	int h = 9, l = 9, m = 9;
	Joueur leJoueur = new Joueur();
	leJoueur.setNom();
	System.out.println("Voulez-vous jouer ?");
	while(leJoueur.ouiNon()){
	    System.out.println("Les paramètres par défaut sont :");
	    System.out.println(" hauteur : "+h+ "\n largeur : "+l+"\n mines : "+m);
	    System.out.println("Voulez-vous les changer ?");
	    if(leJoueur.ouiNon()){
		System.out.println("Quelle hauteur ?");
		h = leJoueur.nombreChoisi();
		while(h < 1 || h > 26){
		    System.out.println("Veuillez donner une hauteur entre 1 et 26");
		    h = leJoueur.nombreChoisi();
		}
		System.out.println("Quelle largeur ?");
		l = leJoueur.nombreChoisi();
		while(l < 1 || l > 38){
		    System.out.println("Veuillez donner une largeur entre 1 et 38");
		    l = leJoueur.nombreChoisi();
		}
		System.out.println("Combien de mines ?");
		m = leJoueur.nombreChoisi();
		while(m < 1 || m > h*l){
		    System.out.println("Veuillez donner un nombre de mines entre 1 et "+(h*l));
		    m = leJoueur.nombreChoisi();
		}
	    }
	    System.out.println("Ok, c'est parti !");
	    Plateau lePlateau = new Plateau(h,l,m);
	    Jeu demineur = new Jeu(leJoueur, lePlateau);
	    boolean victoire = demineur.jouer();
	    if(victoire)
		System.out.println("Bravo !");
	    else
		System.out.println("Ouch...");
	    System.out.println("Voulez-vous rejouer ?");
	}
	System.out.println("Au revoir "+leJoueur.getNom() +"...");
    }
}
