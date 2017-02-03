class EntierChainable implements PileChainee.Chainable{
    int i;
    public EntierChainable(int i){
        this.i=i;
    }
    PileChainee.Chainable next;
    public PileChainee.Chainable getSuivant(){
        return next;
    }
    public void setSuivant(PileChainee.Chainable n){
        next=n;
    } public int val(){
        return i;
    }
}
