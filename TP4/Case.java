class Case{
    private boolean couleur;
    private int x,y;
    private Piece piece;

    ///Exercice 2
    public boolean estVide(){
        if(this.piece == null){
            return true;
        }else{
            return false;
        }
    }
    public Piece getPiece(){
        if(!estVide()){
            return this.piece;
        }else{
            return null;
        }
    }
    public void removePiece(){
        this.piece = null;
    }
    public void fill(Piece p){
        this.piece = p;
    }
    //////
    public String toString(){
        if(this.piece != null){
            return this.piece.toString();
        }
        if(this.couleur){
            return " B ";
        }else{
            return " N ";
        }
    }
    public void setCouleur(boolean x){
        this.couleur = x;
    }
    public void Coordonne(int a, int b){
        this.x = a;
        this.y = b;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
