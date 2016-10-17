class Plateau{
    private static final int longueur = 8;
    private static final int largeur = 8;
    private Case [] cases;

    public Plateau(){
        int a  = 0;
        this.cases = new Case [longueur*largeur];
        for(int i = 0;i<longueur;i++){
            for(int j = 0;j<largeur;j++){
                cases[a] = new Case();
                if((i+j)%2 == 0){
                    cases[a].setCouleur(true);
                }

                cases[a].Coordonne(i,j);
                a++;
            }
        }
    }
    public void afficher(){
        for(int i = 0;i<this.cases.length;i++){
            if(i%8 == 0 ){
                System.out.println();
            }
            System.out.print(this.cases[i].toString());
        }
        System.out.println();
    }
    public Case giveCase(int x, int y){
        for(Case yo : this.cases){
            if(yo.getY() == y && yo.getX() == x){
                return yo;
            }
        }
        return null;
    }
    public boolean deplace(Mouvement m, boolean joueur){
        if(m.isValid(this,joueur)){
            m.faire(this);
            return true;
        }else{
            return false;
        }
    }
    public void initialisation(){
        this.cases[0].fill(new Tour());
        this.cases[1].fill(new Cavalier());
        this.cases[2].fill(new Fou());
        this.cases[3].fill(new Dame());
        this.cases[4].fill(new Roi());
        this.cases[5].fill(new Fou());
        this.cases[6].fill(new Cavalier());
        this.cases[7].fill(new Tour());
        for(int i = 0;i<8;i++){
            this.cases[8+i].fill(new Pion());
            this.cases[63-8-i].fill(new Pion());
        }
        for(int j = 0;j<16;j++){
            this.cases[j].getPiece().setCouleur(true);
        }
        this.cases[63].fill(new Tour());
        this.cases[62].fill(new Cavalier());
        this.cases[61].fill(new Fou());
        this.cases[59].fill(new Dame());
        this.cases[60].fill(new Roi());
        this.cases[58].fill(new Fou());
        this.cases[57].fill(new Cavalier());
        this.cases[56].fill(new Tour());
    }
}
