import java.io.*;
import java.util.*;

class Arbre{
    public static void main(String[] args) {
        Arbre a = new Arbre();
        File b = new File("/test/");
        Arbre.Noeud c = new Arbre(). new Noeud(b);
        a.racine = c;
        a.afficher();
    }
    class Noeud{
        private boolean repertoire;
        private String nom;
        private long taille;
        private ArrayList<Noeud> fils;
        public Noeud(File a){
            try{

                this.nom = a.getName();
                this.repertoire = a.isDirectory();
                this.taille = a.length();
                if(this.repertoire){

                    for(File b : a.listFiles()){
                        this.fils.add(new Noeud(b));
                    }
                }
            } catch(Exception FileNotFoundException){
                System.out.println("yoooo");
            }
        }
        void afficher(Noeud a){
            System.out.println(a.nom);
            if(a.repertoire){
                for (Noeud p : a.fils){
                    afficher(p);
                }
            }
        }
    }
    private Noeud racine;

    void afficher(){
        Noeud a = this.racine;
            if(a.repertoire){
                for (Noeud p : a.fils){
                    p.afficher(p);
                }
            }else{
                a.afficher(a);
            }


    }

}
