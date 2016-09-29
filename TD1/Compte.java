public class Compte{
    private Personne personne;
    private int solde;
    private int numero;
    public static int nbComptes = 0;
    public Compte(Personne a, int b){
        this.personne = a;
        this.solde = b;
        this.numero = nbComptes;
        nbComptes++;

    }
    public int getSolde(){
        return this.solde;
    }
    public void credite(int montant){
        this.solde = this.solde + montant ;
    }
    public void debite(int montant){
        this.solde = this.solde - montant ;
    }
    public void retirer(int montant){
        if(montant<=this.solde){
            this.solde = this.solde-montant;
            this.personne.monnaie = this.personne.monnaie + montant;
        }
    }

    public void deposer(int montant){
        if(montant<=this.personne.monnaie){
            this.personne.monnaie = this.personne.monnaie-montant;
            this.solde = this.solde + montant;
        }
    }
}
