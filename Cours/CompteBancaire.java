class CompteBanquaire{
    private long numero;
    private long balance;
    private Action der;
    public class Action{
        private String act;
        private long montant;
        Action(String act, long montant){
            this.act=act;
            this.montant= montant;
        }
        public String toString(){
            return numero"+":+act+" "+montant; 
}

} //… public void depot(long montant){ balance += montant; der=new Action("depot",montant); } public void retrait(long montant){ balance -= montant; der=new Action("retrait",montant); }

}
