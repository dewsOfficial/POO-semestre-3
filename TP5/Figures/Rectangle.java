class Rectangle extends Figure implements Deformable{

    private double longueur;
    private double hauteur;
    public Rectangle(int x, int y, double longueur, double hauteur){
        super(x,y);
        this.longueur = longueur;
        this.hauteur = hauteur;
    }
    public void affiche(){
        System.out.println("");
    }
    public Figure Deformation(double coeffH,double coeffV){
        double a = this.longueur*coeffH;
        double c = this.longueur*coeffV;
        Rectangle b = new Rectangle(getPosX(),getPosY(),a,c);
        return b;
    }
    public double surface(){
        double a = this.longueur*this.hauteur;
        return a ;
    }
}
