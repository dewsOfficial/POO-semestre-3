class Tamagotchi{
    private int maxEnergie;
    private int energie;
    private String nom;

    public Tamagotchi(String a){
        this.nom = a;
        this.maxEnergie = 5 + (int)(Math.random() * ((9 - 5) + 1));
        this.energie = 2 + (int)(Math.random() * ((5 - 2) + 1));
    }
    public void parler(){
        System.out.println(this.nom);
        if(this.energie < 6){
            System.out.println("Affamé");
        }else{
            System.out.println("Heureux");
        }
    }
    public boolean manger(){
        if(this.energie==this.maxEnergie){
            this.energie = this.energie+ 1 + (int)(Math.random() * ((2 - 1) + 1));
            return true;
        }else{
            System.out.println("C'est au max gros");
            return false;
        }
    }
    public boolean vivre(){
        if(energie<=0){
            return true;
        }else{
            return true;
        }
    }
}
