// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//Hint =>
//Take user input for the age and height of the 3 friends and store it in a variable
//Find the smallest of the 3 ages to find the youngest friend and display it
//Find the largest of the 3 heights to find the tallest friend and display it

import java.util.Scanner;

public class Friendscompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age and height of Amar: ");
        int age1 = sc.nextInt();
        int height1 = sc.nextInt();

        System.out.print("Enter age and height of Akbar: ");
        int age2 = sc.nextInt();
        int height2 = sc.nextInt();

        System.out.print("Enter age and height of Anthony: ");
        int age3 = sc.nextInt();
        int height3 = sc.nextInt();

        // Youngest
        if (age1 <= age2 && age1 <= age3) System.out.println("Youngest: Amar");
        else if (age2 <= age1 && age2 <= age3) System.out.println("Youngest: Akbar");
        else System.out.println("Youngest: Anthony");

        // Tallest
        if (height1 >= height2 && height1 >= height3) System.out.println("Tallest: Amar");
        else if (height2 >= height1 && height2 >= height3) System.out.println("Tallest: Akbar");
        else System.out.println("Tallest: Anthony");
    }
}