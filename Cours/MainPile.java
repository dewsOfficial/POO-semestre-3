class MainPile{
    public static void main(String[] args) {
        PileChainee p;
        EntierChainable n;
        p=new PileChainee();
        for(int i=0; i<12;i++){
            n=new EntierChainable(i);
            p.empiler(n);
        }
        while (!p.estVide()){
            System.out.println(((EntierChainable)p.depiler()).val());
        }
    }
}
