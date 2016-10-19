class Carre extends Figure {
    private int longueur;
    public Rectangle(int x, int y, int longueur){
        super(x,y);
        this.longueur = longueur;
    }
    public void affiche(){
        System.out.println("Carre de "+this.longueur+" longueur");
    }
    public double surface(){
        double a = this.longueur*this.longueur;
        return a ;
    }
}
