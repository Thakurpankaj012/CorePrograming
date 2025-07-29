// Create a program to take a number as input find the frequency of each digit in the number using an array and display the frequency of each digit
//Hint =>
//Take the input for a number
//Find the count of digits in the number
//Find the digits in the number and save them in an array
//Find the frequency of each digit in the number. For this define a frequency array of size 10, Loop through the digits array, and increase the frequency of each digit
//Display the frequency of each digit in the number

import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number to find the frequency of each digit: ");
        int number = sc.nextInt();

        // Convert the number to a string to easily access its digits
        String numStr = String.valueOf(number);
        int length = numStr.length();

        // Create an array to store the digits
        int[] digits = new int[length];

        // Fill the array with digits from the number
        for (int i = 0; i < length; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }

        // Create a frequency array of size 10 (for digits 0-9)
        int[] frequency = new int[10];

        // Calculate the frequency of each digit
        for (int digit : digits) {
            frequency[digit]++;
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }

        sc.close();
    }
}
