import java.util.Random;
import java.util.Scanner;
import java.math.*;


public class Craps{

    public static void main(String[] args){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String ans = "";
        do {
            int num = rand.nextInt(13-1) + 1;
            if (num == 7 || num == 11){
                System.out.println("Sum of first roll = " + num + ".   Player wins.");
                System.out.println();
                System.out.print("Do you want to play again? ");

                ans = scan.nextLine();
            }
            else if (num == 2 || num == 3 || num == 12) {
                System.out.println("Sum of first roll = " + num + ".   Player loses.");
                System.out.println();
                System.out.print("Do you want to play again? ");

                ans = scan.nextLine();
            } 
            else if (num == 4 || num == 5 || num == 6 || num == 8 || num == 9 || num == 10){
                System.out.println("Sum of first roll = " + num + ".   " + num +" is the \"point\".");

            }
        } while (ans.equals("y"));
    }
}
        