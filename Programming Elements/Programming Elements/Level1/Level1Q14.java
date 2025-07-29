// Write a program the find the distance in yards and miles for the distance provided by user in feets
//Hint => 1 mile = 1760 yards and 1 yard is 3 feet
//I/P => distanceInFeet
//O/P => Your Height in cm is ___ while in feet is ___ and inches is ___

import java.util.Scanner;
public class Level1Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Distance in feet
        System.out.print("Enter the distance in feet: ");
        double feet = scanner.nextDouble();

        // Conversion logic
        double yards = feet / 3.0;               // 1 yard = 3 feet
        double miles = yards / 1760.0;           // 1 mile = 1760 yards

        // Output
        System.out.println("The distance is " + yards + " yards and " + miles + " miles.");
    }
}
