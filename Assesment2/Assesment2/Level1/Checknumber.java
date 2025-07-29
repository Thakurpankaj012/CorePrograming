// Write a program to check whether a number is positive, negative, or zero.
//Hint =>
//Get integer input from the user and store it in the number variable.
//If the number is positive, print positive.
//If the number is negative, print negative.
//If the number is zero, print zero.

import java.util.Scanner;

public class Checknumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        sc.close();

        if(number > 0){
            System.out.println("The number " + number + " is positive.");
        } else if(number < 0){
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
