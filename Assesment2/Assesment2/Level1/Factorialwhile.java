// // Write a Program to find the factorial of an integer entered by the user.
/// /Hint =>
/// /For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
/// /Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
/// /Using a while loop, compute the factorial.
/// /Print the factorial at the end.

import java.util.Scanner;

public class Factorialwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
    }
}
