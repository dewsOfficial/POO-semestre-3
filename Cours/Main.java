import Pile.*;


public class Main {
    public static void vider(Pile p) {
        while (!p.estVide()) {
            System.out.println(p.depiler());
        }
    }
    public static void main(String[] args) {
        PileLL<Integer> p1 = new PileLL<Integer>();
        for (int i = 0; i < 10; i++) {
            p1.empiler(i);
        }
        vider(p1);
        Pile<String> p2 = new PileAL<String>();
        p2.empiler("un");
        p2.empiler("deux");
        p2.empiler("trois");
        vider(p2);
        Pile<Integer> p3 = new PileTabInteger(100);
        for (int i = 10; i > 0; i--) {
            p3.empiler(i);
        }
        vider(p3);
    }
}
