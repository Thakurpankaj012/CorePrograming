// Create a program to convert the distance of 10.8 kilometers to miles.
//Hint: 1 km = 1.6 miles
//I/P => NONE
//O/P => The distance  ___ km in miles is ___

public class Level1Q3
{
    public static void main(String[] args) {
        // Distance in kilometers
        double kilometers = 10.8;

        // Conversion factor from kilometers to miles
        double conversionFactor = 1.6;

        // Convert kilometers to miles
        double miles = kilometers / conversionFactor;

        // Output the result
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}
