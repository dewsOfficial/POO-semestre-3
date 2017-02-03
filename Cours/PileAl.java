package pile;
import java.util.EmptyStackException;
import java.util.ArrayList;

interface Pile <T>{
    T empiler(T v);
    T dépiler();
    boolean estVide();
}
public class PileAL<T> implements Pile<T>{
    private ArrayList<T> items;
    public PileAL() {
        items =new ArrayList<T>(10);
    }
    public boolean estVide(){
        return items.size()==0;
    }
    public T empiler(T item){
        items.add(item);
        return item;
    }
    public synchronized T depiler(){
        int top = items.size()-1;
        T item = null;
        if (top < 0) throw new EmptyStackException();
        item = items.get(top);
        items.remove(top);
        return item;
    }
}
