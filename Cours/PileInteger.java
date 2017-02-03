package pile;
import java.util.EmptyStackException;

interface Pile <T>{
    T empiler(T v);
    T dépiler();
    boolean estVide();
}
public class PileTabInteger implements Pile<Integer> {
    private Integer[] items;
    private int top = 0;
    private int max;
    public PileTabInteger(int i) {
        max = i; items = new Integer[max];
    }
    public PileTabInteger() {
        this(100);
    }
    @Override public Integer empiler(Integer item) {
        if (this.estPleine()) {
            throw new EmptyStackException();
        }
        items[top++] = item;
        return item;
    }
    @Override public synchronized Integer depiler() {
        if (this.estVide()) {
            throw new EmptyStackException();
        }
        Integer item = items[--top];
        return item;
    }
    @Override public boolean estVide() {
        return (top == 0);
    }
    public boolean estPleine() {
        return (top == max - 1);
    }
    @Override protected void finalize() throws Throwable {
        items = null; super.finalize();
    }
}
