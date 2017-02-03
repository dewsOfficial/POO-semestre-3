import gomoku.*;

public class Plateau {
    Case[][] cases;

    public Plateau(int largeur, int hauteur) {
        if (largeur <= 5 || hauteur <= 5){
            System.out.println("pour pouvoir jouer, il faut un plateau de dimensions 5x5 minimum ");
            System.exit(1);
        }
        this.cases = new Case[hauteur][largeur];
    }

    public boolean effacePlateau(){
        for (int i = 0; i < this.cases.length; i++){
            for (int j = 0; j  < this.cases[i].length; j++ ){
                this.cases[i][j].effacerCase();
            }
        }
        return true;
    }
    public boolean verifierLigne(Joueur j , Position pos) {
        Case c;
        int debut = 0;
        int fin = this.cases.length - 1;
        if (pos.x >= 5) {
            debut = pos.x - 4;
        }
        if (pos.x < this.cases.length - 5) {
            fin = pos.x + 4;
        }

        int consecutifs = 0;
        for (int i = debut; i <= fin; i++) { //pourquoi i+4
            c = this.cases[i][pos.y];
            if (c.pion.joueur.jid == j.jid && !c.comptee) {
                consecutifs += 1;
            } else {
                consecutifs = 0;
            }
            if (consecutifs == 5) {
                return true;
            }
        }
        return false;
    }
    public boolean verifierColonne(Joueur j, Position pos){
        Case c;
        int debut = 0;
        int fin = this.cases.length - 1;
        if (pos.y >= 5) {
            debut = pos.y - 4;
        }
        if (pos.y < this.cases.length - 5) {
            fin = pos.y + 4;
        }

        int consecutifs = 0;
        for (int i = debut; i <= fin; i++) { //pourquoi i+4
            c = this.cases[pos.y][i];
            if (c.pion.joueur.jid == j.jid && !c.comptee) {
                consecutifs += 1;
            } else {
                consecutifs = 0;
            }
            if (consecutifs == 5) {
                return true;
            }
        }
        return false;
    }
    public boolean verifierDiagonaleHautBas(Joueur j, Position pos){
        int i = 0;
        int t = 0;
        Case c;
        for(i = i; i<5 && pos.x-i>0 && pos.y+i<this.cases.length; i++){
        }
        for(t = t; t<5 && pos.x+t<this.cases.length && pos.y-t>0; t++){
        }
        int debut1 = pos.x-i;
        int debut2 = pos.y+i;
        int fin1 = pos.x+t;
        int fin2 = pos.y-t;
        int consecutifs = 0;
        for(int h = debut1; h<=fin1;h++){
            c = this.cases[debut1-h][debut2-h];
            if (c.pion.joueur.jid == j.jid && !c.comptee) {
                consecutifs += 1;
            } else {
                consecutifs = 0;
            }
            if (consecutifs == 5) {
                return true;
            }
        }
        return false;
    }
    
    public boolean verifierDiagonaleBasHaut(Joueur j, Position pos){
        int i = 0;
        int t = 0;
        Case c;
        for(i = i; i<5 && pos.x-i>0 && pos.y-i>0; i++){
        }
        for(t = t; t<5 && pos.x+t<this.cases.length && pos.y+t<this.cases.length; t++){
        }
        int debut1 = pos.x-i;
        int debut2 = pos.y-i;
        int fin1 = pos.x+t;
        int fin2 = pos.y+t;
        int consecutifs = 0;
        for(int h = debut1; h<=fin1;h++){
            c = this.cases[debut1+h][debut2+h];
            if (c.pion.joueur.jid == j.jid && !c.comptee) {
                consecutifs += 1;
            } else {
                consecutifs = 0;
            }
            if (consecutifs == 5) {
                return true;
            }
        }
        return false;
    }
    public boolean verifierTour(Joueur joueur, Position pos){
        Case c;
        int debut = 0;
        int fin = this.cases.length - 1;
        if (pos.x >= 5) {
            debut = pos.x - 4;
        }
        if (pos.x < this.cases.length - 5) {
            fin = pos.x + 4;
        }

        int consecutifs = 0;
        for (int i=debut; i <= fin; i++) {
            c = this.cases[i][pos.y];
            if (c.pion.joueur.jid == joueur.jid && !c.comptee) {
                consecutifs += 1;
            } else {
                consecutifs = 0;
            }
            if (consecutifs == 5) {
                System.out.printf("Le joueur %d marque un point", joueur.jid);
                joueur.score += 1;
                for (int j = i - 4; j <= i; j++) {
                    c.comptee = true; // ne pas compter plusieurs fois les mm lignes gagnantes
                }
                return true;
            }
        }

        if (pos.y >= 5) {
            int debut2 = pos.y - 4;
        }
        if (pos.y < this.cases[1].length - 5) {
            int fin2 = pos.y + 4;
        }
        consecutifs = 0;
        for (int i=debut; i <= fin; i++) {
            c = this.cases[pos.x][i];
            if (c.pion.joueur.jid == joueur.jid && !c.comptee) {
                consecutifs += 1;
            }else {
                consecutifs = 0;
            }
            if (consecutifs == 5){
                System.out.printf("Le joueur %d marque un point", joueur.jid);
                joueur.score += 1;
                for (int j=i-4; j<=i; j++) {
                    c.comptee = true;
                }
                return true;
            }
        }
        System.out.println("yo");
        return false;
    }

    public void placerPion(Joueur j, Position pos){
        Pion p = new Pion(j, pos);
        this.cases[pos.x][pos.y].poserPion(p);
        boolean gagne = this.verifierScore(j);
    }

    private boolean verifierScore(Joueur j) {
        return false;
    }
}
