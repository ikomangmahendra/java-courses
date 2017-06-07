package md01;

/**
 * This program displays a conversion
 * table of gallons to liters.
 */
public class GalToLitTable {

    public static void main(String args[]) {
        double liters;
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            liters = i * 3.7854; // gallon to liter conversion process
            System.out.println(i + " gallons is " + liters + " liters.");

            counter = counter + 1;
            if (counter == 10) { // every 10th, print a blank line
                counter = 0; // reset the line counter
                System.out.println(); // print a blank line
            }
        }
    }
}
