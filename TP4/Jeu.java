class Jeu{
    private Communication com;
    public Plateau p;

    public Jeu(){
        this.p = new Plateau();
        p.initialisation();
        this.com = new Communication();
    }
    public void jouer(int n){
        boolean a = true;
        for(int i = 0;i<n; i++){
            if(i%2 == 0){
                a = true;
                System.out.println("Joueur 1");
            }else{
                a = false;
                System.out.println("Joueur 2");
            }
            Mouvement m = new Mouvement();
            m = this.com.demanderMouvement(this.p);
            while(!m.isValid(p,a)){
                System.out.println("Mouvement invalide");
                m = this.com.demanderMouvement(this.p);
            }
            p.deplace(m,a);
            p.afficher();
        }
    }
}
