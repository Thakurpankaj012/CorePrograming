// Rewrite the above program to find the power of a number using a while loop.
//Hint =>
//Get integer input for two variables named number and power.
//Create a result variable with an initial value of 1.
//Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
//In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
//Finally, print the result

import java.util.Scanner;

public class Powerwhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int number = sc.nextInt();
        System.out.print("Enter power: ");
        int power = sc.nextInt();

        int result = 1, counter = 0;
        while (counter < power) {
            result *= number;
            counter++;
        }
        System.out.println("Result: " + result);
    }
}