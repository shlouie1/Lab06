import java.util.Random;
import java.util.Scanner;
import java.lang.String;

public class HighorLow {
    public static void main(String[] args) {

        //initialize objects, variables, and establish the random number to be guessed
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();
        String trash = "";
        boolean programDone = false;
        int randInt = 0;
        int userInt = 0;

        randInt = rand.nextInt(1, 11);

        //do while for valid input and guesses
        do {
           System.out.print("What number do you guess 1-10: ");
           if (userInput.hasNextInt()) { //checks for valid input type
               userInt = userInput.nextInt(); //if valid input type (int) then set that to the users guess variable
               //logic for if they guessed the number wrong or not & range
               if (userInt <= 10 && userInt >= 1) {
                   if (userInt == randInt) {
                       System.out.println("You guessed correctly with: " + userInt);
                   }
                   else {
                       System.out.println("You guessed incorrectly with: " + userInt);
                   }
                   programDone = true; // end program
               }

               else {
                   //reiterate for bad integer
                   System.out.println("Try again with a valid integer. Not: " + userInt);
               }
           }
           //reiterate for bad datatype (!String)
           else {
               trash = userInput.nextLine();
               System.out.println("Try again with a valid integer between 1 & 10. Not: " + trash);
           }
        } while (!programDone);

    }
}
