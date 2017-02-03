class PileChainee{
    public static interface Chainable{
        public Chainable getSuivant();
        public void setSuivant(Chainable noeud);
    }
     Chainable tete;
     public void empiler(Chainable n){
         n.setSuivant(tete);
         tete=n;
     }
     public Object depiler(){
         Chainable tmp;
         if (!estVide()){
             tmp=tete;
             tete=tete.getSuivant();
             return tmp;
         } else return null;
     }
    public boolean estVide(){
        return tete==null;
    }
}
