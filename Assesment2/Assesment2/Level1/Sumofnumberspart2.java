// Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
//Hint =>
//Use infinite while loop as in while (true)
//Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

import java.util.Scanner;
public class Sumofnumberspart2 {
    public static void main(String[] args) {
        double total = 0.0;
        double userInput;
        System.out.println("Enter numbers (0 or negative to stop):");

        while (true) {
            Scanner sc = new Scanner(System.in);
            userInput = sc.nextDouble();

            if (userInput <= 0) { // Check for 0 or negative number
                break; // Exit the loop
            }
            total += userInput; // Add user input to total
        }
        System.out.println("Sum of numbers: " + total); // Display the total sum
    }
}
