import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        //init objects and variables
        Scanner userInput = new Scanner(System.in);

        double tankVol = 0;
        double carEfficiency = 0;
        double gasPrice = 0;

        double priceCenMiles = 0;
        double distanceFullTank = 0;

        boolean programDone = false;
        String trash = "";

        //do while for vol of gas in tank
        do {
            System.out.println("What is the volume of your gas tank in gallons?: ");
            if (userInput.hasNextDouble()) {
                tankVol = userInput.nextDouble();
                userInput.nextLine();
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again with a valid number!");
            }
        } while (!programDone);
        programDone = false; //reset program being done

        // do while for car's effieciency
        do {
            System.out.println("What is the MPG of your car?: ");
            if (userInput.hasNextDouble()) {
                carEfficiency = userInput.nextDouble();
                userInput.nextLine();
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again with a valid number!");
            }
        } while (!programDone);
        programDone = false; // reset program being done

        //price of gas per gal
        do {
            System.out.println("What is the price per-gallon of gas?: ");
            if (userInput.hasNextDouble()) {
                gasPrice = userInput.nextDouble();
                userInput.nextLine();
                programDone = true;
            }
            else {
                trash = userInput.nextLine();
                System.out.println("Invalid input: " + trash);
                System.out.println("Try again with a valid number!");
            }
        } while (!programDone);

        //arithmetic for car statistics
        priceCenMiles = (100 / carEfficiency) * gasPrice;
        distanceFullTank = tankVol * carEfficiency;

        //print results
        System.out.println("It costs $" + priceCenMiles + " to travel 100 miles in your car!");
        System.out.println("You can travel " + distanceFullTank + " miles on a full tank!");

    }
}
