import java.util.*;
class SimulTamagotchi{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i = 0; i<b;i++ ){
            System.out.println("Nom de votre Tamagotchi : ");
            Scanner sca = new Scanner(System.in);
            Tamagotchi yo = new Tamagotchi(sca.nextLine());
            while(yo.energie > 0){
                yo.parler();
                System.out.println("Le faire manger ?");
                Scanner scaa = new Scanner(System.in);
                if(scaa.nextLine().equals("oui")){
                    System.out.println("Merci j'avais faim");
                    boolean a = yo.manger();

                }
                else{
                    if(yo.vivre()){
                        System.out.println("Je vais bien tkt même si tu ne me nouris pas");
                        yo.energie--;
                    }else{
                        System.out.println("Meurt de faim");
                    }
                }

            }
            System.out.println("Il est mort Jimmy");

        }
    }
}
