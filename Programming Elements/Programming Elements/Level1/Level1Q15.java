// Write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
//Hint => NA
//I/P => unitPrice, quantity
//O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___

import java.util.Scanner;
public class Level1Q15 {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Input the unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = sc.nextDouble();

        System.out.print("Enter the quantity to be bought: ");
        int quantity = sc.nextInt();

        // Calculate the total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + unitPrice);

        // Close the scanner
        sc.close();
    }
}