// Create a program to print a multiplication table of a number.
//Hint =>
//Get an integer input and store it in the number variable. Also, define a integer array to store the results of multiplication from 1 to 10
//Run a loop from 1 to 10 and store the results in the multiplication table array
//Finally, display the result from the array in the format number * i = ___

import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = sc.nextInt();

        // Define an array to store multiplication results
        int[] multiplicationTable = new int[10];

        // Calculate multiplication results
        for (int i = 1; i <= 10; i++) {
            multiplicationTable[i - 1] = number * i;
        }

        // Display the multiplication table
        for (int i = 0; i < multiplicationTable.length; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }

        sc.close();
    }
}