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
                if(i == 0 || i == 1 || i == 7 || i == 6){
                    cases[a].fill(new Piece());
                    if(i == 0 || i == 1){
                        cases[a].getPiece().setCouleur(true);
                    }else{
                        cases[a].getPiece().setCouleur(false);
                    }
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
}
