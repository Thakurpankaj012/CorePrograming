// Write a program that takes your height in centimeters and converts it into feet and inches
//Hint => 1 foot = 12 inches and 1 inch = 2.54 cm
//I/P => height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

public class Level1Q10
{
    public static void main(String[] args) {
        // Height in centimeters
        double heightInCm = 170; // Example height, you can change this value

        // Conversion factors
        double cmToInches = 2.54;
        double inchesInFoot = 12;

        // Convert centimeters to inches
        double heightInInches = heightInCm / cmToInches;

        // Convert inches to feet and remaining inches
        int feet = (int) (heightInInches / inchesInFoot);
        double remainingInches = heightInInches % inchesInFoot;

        // Output the result
        System.out.println("Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + remainingInches);
    }
}
