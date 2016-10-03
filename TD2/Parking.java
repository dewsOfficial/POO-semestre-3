import java.util.*;
class Parking{
    private int places;
    public int libre;
    public List <Voiture> list;
    private int pourcentage;
    public Voiture[] voitures;

    int premierePlaceLibre(){
        int a = 0;
        for(int i = 0; i<Voiture.length;i++){
            if(Voiture[i] == null){
                a = i;
                break;
            }
        }
        return a;
    }
    int voiturePerdue(Voiture v){
        int a = 0;
        for(int i = 0; i<Voiture.length;i++){
            if(Voiture[i] == v){
                a = i;
                break;
            }
        }
        return a;
    }


}
