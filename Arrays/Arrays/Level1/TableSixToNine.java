// Create a program to find the multiplication table of a number entered by the user from 6 to 9 and display the result
//Hint =>
//Take integer input and store it in the variable number as well as define an integer array to store the multiplication result in the variable multiplicationResult
//Using a for loop, find the multiplication table of numbers from 6 to 9 and save the result in the array
//Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;
public class TableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number (6 to 9) to print its multiplication table: ");
        int number = sc.nextInt();

        // Validate input
        if (number < 6 || number > 9) {
            System.out.println("Please enter a number between 6 and 9.");
            sc.close();
            return;
        }

        // Define an array to store multiplication results
        int[] multiplicationResult = new int[10];

        // Calculate multiplication results
        for (int i = 1; i <= 10; i++) {
            multiplicationResult[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationResult[i]);
        }

        sc.close();
    }
}