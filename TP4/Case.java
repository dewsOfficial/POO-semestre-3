class Case{
    private boolean couleur;
    private int x,y;

    public String toString(){
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
