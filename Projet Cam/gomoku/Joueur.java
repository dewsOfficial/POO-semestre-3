package gomoku;

public class Joueur {
    public int jid;// identifiant du Joueur egale a 1 ou 2
    public int score;// score du joueur qui sera calculé au fur et a mesure

    public Joueur(int jid) {
        this.jid = jid;
        this.score = 0;
    }
}
