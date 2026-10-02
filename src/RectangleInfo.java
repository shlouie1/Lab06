import java.util.Scanner;
import java.lang.Math;

public class RectangleInfo {
    public static void main (String[] args) {

        //init objects and variables
        Scanner userInput = new Scanner(System.in);
        String trash = "";
        boolean programDone = false;
        double rectLen = 0;
        double rectWid = 0;
        double rectPerim = 0;
        double rectArea = 0;
        double rectDiag = 0;

        // do while for length
        do {
            System.out.print("What is the length of your rectangle?: ");
            if (userInput.hasNextDouble()) {
                rectLen = userInput.nextDouble();
                userInput.nextLine();
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash + "\nTry again with a valid number! "); //wanted to try newline char
            }
        } while (!programDone);
        programDone = false; // reset program done status

        //do while for width
        do {
            System.out.print("What is the width of your rectangle?: ");
            if (userInput.hasNextDouble()) {
                rectWid = userInput.nextDouble();
                userInput.nextLine();
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash + "\nTry again with a valid number! "); //again, wanted to try new line char
            }
        } while (!programDone);

        //arithmetic logic for perimeter, area, & diag
        rectPerim = (2 * rectLen) + (2 * rectWid);
        rectArea = rectLen * rectWid;
        rectDiag = Math.hypot(rectLen, rectWid); // was planning on using pow & sqrt methods, but found this in the Math class documentation

        //manual implementation
        //rectDiag = Math.sqrt(Math.pow(rectLen, 2) + Math.pow(rectWid, 2));

        //print perimeter, area, & diag
        System.out.println("The perimeter is " + rectPerim + " units.");
        System.out.println("The area is " + rectArea + " units.");
        System.out.println("The diagonal is " + rectDiag + " units.");
    }
}
