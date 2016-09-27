import java.util.*;
class SimulTamagotchi{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        for(int i = 0; i<b;i++ ){
            System.out.println("Nom de votre Tamagotchi : ");
            Scanner sca = new Scanner(System.in);
            Tamagotchi yo = new Tamagotchi(sca.nextLine());
        }
    }
}
