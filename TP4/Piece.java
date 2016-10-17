class Piece{
    private boolean couleur;
    private Case position;
    public boolean isValid(Plateau p, Case arrivee){
        return true;
    }
    public boolean getCouleur(){
        return this.couleur;
    }
    public void setCouleur(boolean a){
        this.couleur = a;
    }
}
