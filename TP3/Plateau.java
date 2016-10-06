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
    
    public Plateau(int hauteur, int largeur, int nbMines){
        //A remplir
    }
    
    public boolean agir(int[] action){
        //A remplir
    }

    public boolean jeuFini(){
        //A remplir
    }

    public boolean jeuGagne(){
        //A remplir
    }

    public String affichage(){
        //A remplir
    }
}
