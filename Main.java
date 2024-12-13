
import java.util.Scanner;

public class Main {
    static double a, b, Result;

    static void Addition() {
        System.out.println(a + " + " + b + " est:"  + (a + b));
    }

    static void Soustraction() {
        System.out.println(a + " - " + b + " est:" + (a - b));
    }

    static void Multiplication() {
        System.out.println(a + " x " + b + " est:" + (a * b));
    }

    static void Division() {
        if (a == 0 || b == 0) {
            System.out.println(" vous ne pouvez pas divise sur 0 !!");
        } else {
            System.out.println(a + " / " + b + " est:" + (a / b));
        }
    }
    static void Puissance(){
        System.out.println(a + " puissance " + b + "est:"+Math.pow(a , b));
    }
    static void Racine_carree(){
        System.out.println("racine carree de a est:" +Math.sqrt(a));
        System.out.println("racine carree de b est:" +Math.sqrt(b));

    }
    static void Factorielle() {
        Result = 1;
        for (int i = 1; i <= a; i++) {
            Result *= i;
        }
        System.out.println(" Factorielle " + a + "est: " + Result);
        for (int i = 1; i <= b; i++){
            Result *=i ;
        }
        System.out.println(" Factorielle " + b + "est: " + Result);
    }
    public static void main(String[] args) {
        int choix;
        Scanner valeur = new Scanner(System.in);

        System.out.println(" Entre le 1ere nombre: ");
        a = valeur.nextDouble();
        System.out.println(" Entre le 2eme nombre: ");
        b = valeur.nextDouble();

        do {
            System.out.println("Menu: ");
            System.out.println(" 1-addition");
            System.out.println(" 2-Soustraction");
            System.out.println(" 3-Multiplication");
            System.out.println(" 4-Division");
            System.out.println(" 5-puissance");
            System.out.println(" 6-Racine carree");
            System.out.println(" 7-Factoriel");
            System.out.println(" 8-quitter");
            choix = valeur.nextInt();
if (choix < 1 && choix > 8 ) {
    System.out.println("choisissez une option");

} else{
    System.out.println(" le choix est invalide");
}
            switch (choix) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Soustraction();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    Puissance();
                    break;
                case 6:
                    Racine_carree();
                    break;
                case 7:
                    Factorielle();
                    break;
                case 8:
                    System.out.println("au revoir!!");

            }

        } while (choix != 8);


    }

}

