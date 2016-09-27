public class Test{
    public static void main(String [] args){
        Personne tony = new Personne ("Parker","Tony",29);
        System.out.println(tony);
        Personne mickael = new Personne("Tony","Gelabale",30);
        mickael.setPrenom("Mickael");
        System.out.println(mickael);
        mickael.monnaie = 80;
        tony.monnaie = 30;
        //tony donne 20 a mickael
        boolean a = donne(tony,mickael,20);
        System.out.println(mickael.monnaie);
        System.out.println(tony.monnaie);
        //mickael lui rends
        boolean b = mickael.donne(tony,20);
        System.out.println(mickael.monnaie);
        System.out.println(tony.monnaie);
    }
    public static boolean donne(Personne p1, Personne p2, int montant){
        if(montant<=p1.monnaie){
            p1.monnaie = p1.monnaie-montant;
            p2.monnaie = p2.monnaie+montant;
            return true;
        }else{
            return false;
        }
    }
}
