// Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on their ages and the tallest among the friends based on their heights
//Hint =>
//Take user input for age and height for the 3 friends and store it in two arrays each to store the values for age and height of the 3 friends
//Loop through the array and find the youngest of the 3 friends and the tallest of the 3 friends
//Finally display the youngest and tallest of the 3 friends

import java.util.Scanner;
public class YoungestFriend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define arrays to store ages and heights of the friends
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Get input for each friend's age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter the height of " + names[i] + ": ");
            heights[i] = sc.nextDouble();
        }

        // Find the youngest friend
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }

        // Find the tallest friend
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }

        // Display the results
        System.out.println("The youngest friend is " + names[minAgeIndex] + " with age " + ages[minAgeIndex]);
        System.out.println("The tallest friend is " + names[maxHeightIndex] + " with height " + heights[maxHeightIndex]);

        sc.close();
    }
}


