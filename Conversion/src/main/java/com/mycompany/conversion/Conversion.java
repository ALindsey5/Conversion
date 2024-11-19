package com.mycompany.conversion;

public class Conversion {

    // Convert from feet to meters
    public static double footToMeter(double feet) {
        return 0.305 * feet;
    }

    // Convert from meters to feet
    public static double meterToFeet(double meter) {
        return 3.279 * meter;
    }

    public static void main(String[] args) {
        // Display headers
        System.out.printf("%-10s %-10s %-10s %-10s\n", "Feet", "Meters", "Meters", "Feet");

        // Loop to display the output for given values
        for (double feet = 1.0, meters = 20.0; feet <= 10.0 && meters <= 65.0; feet++, meters += 5.0) {
            double feetToMeters = footToMeter(feet);
            double metersToFeet = meterToFeet(meters);

            System.out.printf("%-10.1f %-10.3f %-10.1f %-10.3f\n", feet, feetToMeters, meters, metersToFeet);
        }
    }
}
