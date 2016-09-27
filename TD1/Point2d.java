public class Point2d{
    private double x,y;
    public Point2d(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        String a = "("+this.x+","+this.y+")";
        return a;
    }
    public static void main(String[] args) {
        Point2d p1 = new Point2d(3.4, 5.6);
        Point2d p2 = new Point2d(8.2,3.4);
        System.out.println(p1);
        System.out.println(p2);
    }
}
