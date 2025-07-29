// Rewrite the above program to store the marks of the students in physics, chemistry, and maths in a 2D array and then compute the percentage and grade
//Hint =>
//All the steps are the same as the problem 8 except the marks are stored in a 2D array
//Use the 2D array to calculate the percentages, and grades of the students

import java.util.Scanner;

public class StudentMarksPart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // 2D array: rows = students, columns = subjects
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Step 2: Input marks
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                System.out.print(subject + ": ");
                int mark = sc.nextInt();

                // Re-enter if mark is negative
                if (mark < 0) {
                    System.out.println("Marks cannot be negative. Please re-enter.");
                    j--; // decrement j to re-enter same subject
                } else {
                    marks[i][j] = mark;
                }
            }
        }

        // Step 3: Calculate percentage and grade
        for (int i = 0; i < n; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            if (percentage[i] >= 90)
                grade[i] = 'A';
            else if (percentage[i] >= 75)
                grade[i] = 'B';
            else if (percentage[i] >= 60)
                grade[i] = 'C';
            else if (percentage[i] >= 40)
                grade[i] = 'D';
            else
                grade[i] = 'F';
        }

        // Step 4: Display results
        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + " => Percentage: " + percentage[i] + "%, Grade: " + grade[i]);
        }

        sc.close();
    }
}
