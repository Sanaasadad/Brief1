
import java.util.Scanner;

public class Main {
    static int n1,n2;
    static void Addition (){
        System.out.println(n1 + " + " + n2 + " is: " + (n1 + n2));
    }
    static void Subtract () {
        System.out.println(n1 + " - " + n2 + " is: " + (n1 - n2));
    }
    static void Multiplication () {
        System.out.println(n1 + " x " + n2 + " is: " + (n1 * n2));
    }
    static void Division () {
        if (n1 == 0 || n2 == 0){
            System.out.println(" you can't divide on 0 ");
        }
        else {
            System.out.println(n1 + " / " + n2 + " is: " + (n1 / n2));
        }
    }
    static void power (){
        System.out.println( n1 + " power " + n2 + " is: " + Math.pow(n1,n2));
    }

        public static void main( String [] args) {
        int choice ;
        do {
            System.out.println("1-Addition\n 2-Subtract\n 3-Multiplication\n 4-Division\n 5-power\n 6-Square\n 7-Factorial\n  ");
            System.out.println("choose an option: ");
            Scanner SS = new Scanner(System.in);
            choice = SS.nextInt();
            System.out.println("Entre first number: ");
            n1 = SS.nextInt();
            System.out.println("Entre second number: ");
            n2 = SS.nextInt();

            switch(choice) {
                case 1:
                    Addition();
                    break;
                case 2:
                    Subtract();
                    break;
                case 3:
                    Multiplication();
                    break;
                case 4:
                    Division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    System.out.println(" try again ");
                    break;
                default:
                    System.out.println("the choice is invalid");
            }
        } while (choice!=5);


    }



}