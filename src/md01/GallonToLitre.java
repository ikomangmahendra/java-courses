package md01;

/**
 * This program converts gallons to liters.
 */
public class GallonToLitre {
    public static void main(String[] args) {
        double gallons; // holds the number of gallons
        double liters; // holds conversion to liters

        gallons = 5; // start with 10 gallons

        liters = gallons * 3.7854; // convert to liters
        System.out.println(gallons + " gallons is " + liters + " liters.");
    }
}
