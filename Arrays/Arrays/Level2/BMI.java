// An organization took up an exercise to find the Body Mass Index (BMI) of all the persons in the team. For this create a program to find the BMI and display the height, weight, BMI and status of each individual
//Hint =>
//Take input for a number of persons
//Create arrays to store the weight, height, BMI, and weight status of the persons
//Take input for the weight and height of the persons
//Calculate the BMI of all the persons and store them in an array and also find the weight status of the persons
//Display the height, weight, BMI, and weight status of each person
//Use the table to determine the weight status of the person

import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of persons
        System.out.print("Enter the number of persons: ");
        int n = sc.nextInt();

        // Create arrays to store weight, height, BMI, and status
        double[] weights = new double[n];
        double[] heights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

        // Input weight and height for each person
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            weights[i] = sc.nextDouble();
            System.out.print("Enter height (m) for person " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();
        }

        // Calculate BMI and determine weight status
        for (int i = 0; i < n; i++) {
            bmis[i] = weights[i] / (heights[i] * heights[i]);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 24.9) {
                statuses[i] = "Normal weight";
            } else if (bmis[i] < 29.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obesity";
            }
        }

        // Display the results
        System.out.println("\nBMI Results:");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n", "Person", "Weight(kg)", "Height(m)", "BMI", "Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10d %-10.2f %-10.2f %-10.2f %-15s%n", (i + 1), weights[i], heights[i], bmis[i], statuses[i]);
        }

        sc.close();
    }
}
