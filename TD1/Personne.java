public class Personne {
    private String nom;
    private String prenom;
    public int age;
    public Personne (String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    public void setPrenom(String p){
        this.prenom = p;
    }
    public void anniversaire(){
        this.age++;
    }
    public String toString(){
        return "Je m'appelle : " +this.prenom+" " +this.nom+ " J'ai "+ this.age+" ans.";
    }
    public int monnaie;
    

    public boolean donne(Personne p, int montant){
        if(montant<=this.monnaie){
            this.monnaie = this.monnaie-montant;
            p.monnaie = p.monnaie+montant;
            return true;
        }else{
            return false;
        }
    }
}
