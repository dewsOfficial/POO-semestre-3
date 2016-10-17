class Mouvement{
    private Case depart;
    private Case arrivee;
    public boolean isValid(Plateau p, boolean joueur){
        if(!this.depart.estVide()){
            if(this.depart.getX()<8 && this.depart.getY()<8 && this.arrivee.getX()<8 && this.arrivee.getY()<8 && this.depart.getX()>=0 && this.depart.getY()>=0 && this.arrivee.getX()>=0 && this.arrivee.getY()>=0){
                if(this.depart.getPiece().getCouleur() == joueur){
                    if(this.arrivee.getPiece() != null){
                        if(this.arrivee.getPiece().getCouleur() != joueur){
                            return true;
                        }else{
                            return false;
                        }
                    }else{
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public void faire(Plateau p){
        if(this.arrivee.getPiece() != null){
            p.giveCase(this.arrivee.getX(),this.arrivee.getY()).removePiece();
        }
        p.giveCase(this.arrivee.getX(),this.arrivee.getY()).fill(this.depart.getPiece());
        p.giveCase(this.depart.getX(),this.depart.getY()).removePiece();
    }
    public void setDepartArrive(Case a,Case b){
        this.depart = a;
        this.arrivee = b;
    }
}
