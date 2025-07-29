//Create a program to convert distance in kilometers to miles.
//Hint =>
//Create a variable km and assign type as double as in double km;
//Create Scanner Object to take user input from Standard Input that is the Keyboard as in Scanner input = new Scanner(System.in);
//Use Scanner Object to take user input for km as in km = input.nextInt();
//Use 1 mile = 1.6 km formulae to calculate miles and show the output
//I/P => km
//O/P => The total miles is ___ mile for the given ___ km

import java.util.Scanner;

public class Level1Q9
{
    public static void main(String[] args) {
        // Import Scanner for user input
        Scanner sc  = new Scanner(System.in);

        // Declare variable for kilometers
        double km;

        // Take user input for kilometers
        System.out.print("Enter distance in kilometers: ");
        km = sc.nextDouble();

        // Conversion factor from kilometers to miles
        double conversionFactor = 1.6;

        // Convert kilometers to miles
        double miles = km / conversionFactor;

        // Output the result
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        // Close the scanner
        sc.close();
    }
}