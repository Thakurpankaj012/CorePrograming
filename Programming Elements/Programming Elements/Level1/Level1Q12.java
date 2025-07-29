// Write a program that takes the base and height to find area of a triangle in square inches and square centimeters
//Hint => Area of a Triangle is ½ * base * height
//I/P => base, height
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

public class Level1Q12 {
    public static void main(String[] args) {
        // Base and height of the triangle in inches
        double baseInches = 10.0; // Example base in inches
        double heightInches = 5.0; // Example height in inches

        // Calculate area in square inches
        double areaInches = 0.5 * baseInches * heightInches;

        // Convert base and height to centimeters (1 inch = 2.54 cm)
        double baseCm = baseInches * 2.54;
        double heightCm = heightInches * 2.54;

        // Calculate area in square centimeters
        double areaCm = 0.5 * baseCm * heightCm;

        // Output the results
        System.out.println("The area of the triangle is " + areaInches + " square inches.");
        System.out.println("The area of the triangle is " + areaCm + " square centimeters.");
    }
}