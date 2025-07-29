// Rework the program 2, especially the Hint f where if index equals maxDigit, we break from the loop. Here we want to modify to Increase the size of the array i,e maxDigit by 10 if the index is equal to maxDigit. This is done to consider all digits to find the largest and second-largest number
//Hint =>
//In Hint f inside the loop if the index is equal to maxDigit, increase maxDigit and make digits array to store more elements.
//To do this, we need to create a new temp array of size maxDigit, copy from the current digits array the digits into the temp array, and assign the current digits array to the temp array
//Now the digits array will be able to store all digits of the number in the array and then find the largest and second largest number

import java.util.Scanner;
public class MaxDigit {
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
                // Increase size of the array if needed
                maxDigit += 10; // Increase by 10
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp; // Assign resized array back to digits
            }
            digits[index++] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit from the number
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