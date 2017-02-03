package gomoku;

public class Case {
    public Position pos;
    public Pion pion; //pion null si vide
    public boolean comptee;

    //Constructeur de case
    public Case(Position pos) {
        this.pos = pos;
        this.pion = null;
        this.comptee = false;
    }

    public boolean poserPion(Pion p) {
        if (this.pion != null) {
            return false;
        }
        this.pion = p;
        return true;
    }

    public void effacerCase() {
        this.pion = null;
    }
}
