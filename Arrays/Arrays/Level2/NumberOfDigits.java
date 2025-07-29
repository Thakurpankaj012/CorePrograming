// Create a program to store the digits of the number in an array and find the largest and second largest element of the array.
//Hint =>
//Create a number variable and Take user input.
//Define an array to store the digits. Set the size of the array to maxDigit variable initially set to 10
//Create an integer variable index with the value 0 to reflect the array index.
//Use a loop to iterate until the number is not equal to 0.
//Remove the last digit from the number in each iteration and add it to the array.
//Increment the index by 1 in each iteration and if the index count equals maxDigit then break out of the loop and the remaining digits are not added to the array
//Define variable to store largest and second largest digit and initialize it to zero
//Loop through the array and use conditional statements to find the largest and second largest number in the array
//Finally display the largest  and second-largest number

import java.util.Scanner;
public class NumberOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Define an array to store the digits
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            if (index >= maxDigit) {
                break; // Stop if we reach the maximum size of the array
            }
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit from the number
            index++;
        }

        // Variables to find largest and second largest digits
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Find largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        sc.close();
    }
}