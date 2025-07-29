// Write a program to find the side of the square whose parameter you read from user
//Hint => Perimeter of Square is 4 times side
//I/P => perimeter
//O/P => The length of the side is ___ whose perimeter is ____

import java.util.Scanner;
public class Level1Q13 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the length of one side of the square
        double sideLength = perimeter / 4;

        // Output the result
        System.out.println("The length of the side is " + sideLength + " whose perimeter is " + perimeter);

        // Close the scanner
        sc.close();
    }
}