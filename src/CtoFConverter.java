import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        //init scanner object & string & vars
        Scanner userInput = new Scanner(System.in);
        boolean programDone = false;
        String trash = "";
        double tempInC = 0;
        double tempInF = 0;


        // do while loop logic that handles bad input
        do {
            System.out.print("What is the Fahrenheit temperature in Celsius?: ");
            if (userInput.hasNextDouble()) {
                tempInC = userInput.nextDouble();
                userInput.nextLine();

                tempInF = (tempInC * ((double)9 / 5)) + 32;
                System.out.println("Celsius of " + tempInC + " is equal to Fahrenheit of " + tempInF);
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("You have to input a valid number!");
            }
        } while (!programDone);
    }
}
