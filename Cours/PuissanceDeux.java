public class PuissanceDeux {
    static int[] tab = new int[12];
    static{
        tab[0]=1;
        for(int i=0; i< tab.length-1;i++) tab[i+1]= suivant(tab[i]);
    }
    static int suivant(int i){
        return i*2;
    }
}
