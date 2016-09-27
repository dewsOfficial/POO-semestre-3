public class Test{
    public static void main(String [] args){
        Personne tony = new Personne ("Parker","Tony",29);
        System.out.println(tony);
        Personne mickael = tony;
        mickael.setPrenom("Mickael");
        System.out.println(mickael);
    }
}
