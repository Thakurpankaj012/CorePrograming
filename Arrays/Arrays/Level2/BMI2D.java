// Rewrite the above program using multi-dimensional array to store height, weight, and BMI in 2D array for all the persons
//Hint =>
//Take input for a number of persons
//Create a multi-dimensional array to store weight, height and BMI. Also create an to store the weight status of the persons
//       double[][] personData = new double[number][3];
//       String[] weightStatus = new String[number];
//Take input for weight and height of the persons and for negative values, ask the user to enter positive values
//Calculate BMI of all the persons and store them in the personData array and also find the weight status and put them in the weightStatus array
//Display the height, weight, BMI and status of each person

import java.util.Scanner;

public class BMI2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input for number of persons
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        // Create 2D array to store height, weight and BMI
        double[][] personData = new double[number][3]; // [][0]=height, [][1]=weight, [][2]=BMI
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nEnter details for Person " + (i + 1) + ":");

            // Input and validate height
            double height;
            do {
                System.out.print("Enter height in meters: ");
                height = sc.nextDouble();
                if (height <= 0) {
                    System.out.println("Height must be a positive value.");
                }
            } while (height <= 0);

            // Input and validate weight
            double weight;
            do {
                System.out.print("Enter weight in kilograms: ");
                weight = sc.nextDouble();
                if (weight <= 0) {
                    System.out.println("Weight must be a positive value.");
                }
            } while (weight <= 0);

            // Calculate BMI
            double bmi = weight / (height * height);

            // Store height, weight, and BMI in array
            personData[i][0] = height;
            personData[i][1] = weight;
            personData[i][2] = bmi;

            // Determine weight status
            if (bmi < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi < 25) {
                weightStatus[i] = "Normal weight";
            } else if (bmi < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display results
        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d:\n", (i + 1));
            System.out.printf("Height: %.2f m\n", personData[i][0]);
            System.out.printf("Weight: %.2f kg\n", personData[i][1]);
            System.out.printf("BMI: %.2f\n", personData[i][2]);
            System.out.println("Status: " + weightStatus[i]);
            System.out.println();
        }

        sc.close();
    }
}
