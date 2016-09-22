import java.util.*;
class ADN {
    public static char baseADN(){
        int a = (int)(0 + Math.random()*10/3);
        switch(a){
            case 0 : {
                return 'A';
            }
            case 1 : {
                return 'C';
            }
            case 2 : {
                return 'G';
            }
            case 3: {
                return 'T';
            }
        }
        return 'a';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = "";
        int d = sc.nextInt();
        for(int i = 0; i<d;i++){
            a = a+Character.toString(baseADN());
        }
        System.out.println(a);
    }
}
