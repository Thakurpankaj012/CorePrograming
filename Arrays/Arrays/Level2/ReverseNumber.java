// Create a program to take a number as input and reverse the number. To do this, store the digits of the number in an array and display the array in reverse order
//Hint =>
//Take user input for a number.
//Find the count of digits in the number.
//Find the digits in the number and save them in an array
//Create an array to store the elements of the digits array in reverse order
//Finally, display the elements of the array in reverse order

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        // Convert the number to a string to easily access its digits
        String numStr = String.valueOf(number);
        int length = numStr.length();

        // Create an array to store the digits
        char[] digits = new char[length];

        // Fill the array with digits from the number
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i);
        }

        // Create an array to store the reversed digits
        char[] reversedDigits = new char[length];

        // Reverse the digits
        for (int i = 0; i < length; i++) {
            reversedDigits[i] = digits[length - 1 - i];
        }

        // Display the reversed digits
        System.out.print("Reversed number: ");
        for (char digit : reversedDigits) {
            System.out.print(digit);
        }

        System.out.println(); // New line for better output formatting
        sc.close();
    }
}