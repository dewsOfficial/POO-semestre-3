class Voiture{
    private boolean gare;
    boolean entrerParking(Parking p){
        if(p.libre != 0 && !this.gare){
            p.libre--;
            p.list.add(this);
            return true;
        }else{
            return false;
        }
    }
    void sortirParking(Parking p){
        if(this.gare){
            gare = false;
            System.out.println("Vous venez de sortir du parking");
        }else{
            System.out.println("T'es meme pas garé frere");
        }
    }
    void demandePlace(Parking p,int i){
        if(p.voitures[i] == null){
            entrerParking(p);
            p.voitures[i] = this;
        }
    }
}
