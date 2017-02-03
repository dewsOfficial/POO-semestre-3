import java.util.Scanner;

public class Joueur {
    private String nom;
    private Scanner scan;

    public Joueur(){
	scan = new Scanner(System.in);
        nom = "Anonyme";
    }

    public void setNom(){
        System.out.println("Quel est votre nom ?");
	    nom = scan.nextLine();
	System.out.println("Bonjour "+nom+" !");
    }

    public String getNom(){
	return nom;
    }

    public boolean ouiNon(){
        String ans=scan.nextLine().toUpperCase();
	boolean ok = "OUI".equals(ans)||"NON".equals(ans);
	while (!ok){
	    System.out.println("Répondez 'oui' ou 'non'");
	    ans=scan.nextLine().toUpperCase();
	    ok = "OUI".equals(ans)||"NON".equals(ans);
	}
	if("OUI".equals(ans))
	    return true;
	else
	    return false;
    }

    public int nombreChoisi(){
	String ans = scan.nextLine();
	int result = 0;
	boolean error;
        do{
	    error = false;
	    try{
		          result = Integer.parseInt(ans);
	    } catch(Exception e){
		System.out.println("Pas un nombre");
		ans = scan.nextLine();
		error = true;
	       }
	   } while (error);
	   return Integer.parseInt(ans);
    }

    public int[] actionChoisie(){
	int[] action = new int[3];
	boolean error = true;
	String[] line;
        do{
	    error = false;
	    line = scan.nextLine().split("\\s+");
	    if(line.length != 3){
		System.out.println("Mauvais nombre d'arguments : "+line.length);
		error = true;
	    } else {
		switch (line[0].toUpperCase()){
		case "REVELER" :
		case "R" :
		    action[0] = Plateau.REVELER;
		break;
		case "POSER" :
		case "P" :
		    action[0] = Plateau.POSER;
		break;
		case "ENLEVER" :
		case "E" :
		    action[0] = Plateau.ENLEVER;
		break;
		default :
		    System.out.println("Mauvais type d'action");
		    error = true;
		}

		if(line[1].length() != 1) {
		    System.out.println("Mauvais second argument");
		    error = true;
		}
		else {
		    action[1] = (int)(line[1].toUpperCase().charAt(0)-'A');
		    if(action[1]<0 || action[1]>25){
			System.out.println("Mauvais second argument");
			error = true;
		    }
		}

		try{
		    action[2] = Integer.parseInt(line[2])-1;
		} catch(Exception e){
		    System.out.println("Mauvais troisième argument");
		    error = true;
		}

	    }
	} while (error);


	return action;
    }
}
