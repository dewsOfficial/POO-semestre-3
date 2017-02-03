package gomoku;

public class Pion {
    public Joueur joueur;
    public Position position;

    public Pion(Joueur j, Position pos) {
        this.joueur = j;
        this.position = pos;
    }
}
