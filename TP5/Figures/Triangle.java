class Triangle extends Figure implements Deformable{
    private double base;
    private double hauteur;
    public Triangle(int x, int y, double base,double hauteur){
        super(x,y);
        this.base = base;
        this.hauteur = hauteur;
    }
    public Figure Deformation(double coeffH,double coeffV){
        double a = this.base*coeffH;
        double c = this.hauteur*coeffV;
        Triangle b = new Triangle(getPosX(),getPosY(),a,c);
        return b;
    }
    public void affiche(){
        System.out.println("Triangle isocele de "+this.base+" base et de "+this.hauteur+" hauteur");
    }
    public double surface(){
        double a = this.base*this.hauteur/2;
        return a ;
    }
}
