public abstract class Figure{
    //coordonnées du centre approximatif de la Figure
    private int posX;
    private int posY;

    public Figure(int x, int y){
        posX = x;
        posY = y;
    }
    public int getPosX(){
        return this.posX;
    }
    public int getPosY(){
        return this.posY;
    }
    public abstract void affiche();
    public double estDistantDe(Figure fig){
        double a = Math.sqrt((this.posX-fig.posX)*(this.posX-fig.posX) + (this.posY-fig.posY)*(this.posY-fig.posY)) ;
        return a;
    }
    public abstract double surface();
    public void deplacement(int x, int y){
        this.posX = x;
        this.posY = y;
    }
}
