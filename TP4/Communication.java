import java.util.*;
class Communication{
    private Scanner scan;
    public Mouvement demanderMouvement(Plateau p){
        this.scan = new Scanner(System.in);
        System.out.println("Entrer les coordonnees du pion que vous voulez deplacer (le point (0,0) se trouve en haut à gauche)");
        System.out.print("Absisse : ");
        int a = this.scan.nextInt();
        System.out.print("Ordonne : ");
        int b = this.scan.nextInt();
        System.out.println("Entrer les coordonnées de la case sur laquelle il va se déplacer (le point (0,0) se trouve en haut à gauche)");
        System.out.print("Absisse : ");
        int c = this.scan.nextInt();
        System.out.print("Ordonne : ");
        int d = this.scan.nextInt();
        Mouvement m = new Mouvement();
        m.setDepartArrive(p.giveCase(a,b),p.giveCase(c,d));
        return m;
    }
}
