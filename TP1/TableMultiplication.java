import java.util.*;
class TableMultiplication {
    public static void main(String [] args){
        int a = (int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        System.out.println(a+"X"+b);
        Scanner sc = new Scanner(System.in);
        while(sc.nextInt() != a*b ){
            System.out.println("Faux, recommencez");
            System.out.println(a+"X"+b);
        }
        System.out.println("Bravo");
    }
}
