// Create a program to find the mean height of players present in a football team.
//Hint =>
//The formula to calculate the mean is: mean = sum of all elements / number of elements
//Create a double array named heights of size 11 and get input values from the user.
//Find the sum of all the elements present in the array.
//Divide the sum by 11 to find the mean height and print the mean height of the football team

import java.util.Scanner;
public class MeanHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define an array to store the heights of players
        double[] heights = new double[11];

        // Get input for each player's height
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter the height of player " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate the sum of all heights
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }

        // Calculate the mean height
        double meanHeight = sum / heights.length;

        // Display the mean height
        System.out.println("The mean height of the football team is: " + meanHeight);

        sc.close();
    }
}
