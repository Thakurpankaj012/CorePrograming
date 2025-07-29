// Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade  as per the following guidelines
//
//Hint =>
//Take input for the number of students
//Create arrays to store marks, percentages, and grades of the students
//Take input for marks of students in physics, chemistry, and maths. If the marks are negative, ask the user to enter positive values and decrement the index
//Calculate the percentage and grade of the students based on the percentage
//Display the marks, percentages, and grades of each student


import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Arrays to store marks, percentage and grades
        int[][] marks = new int[n][3]; // [][0] = Physics, [][1] = Chemistry, [][2] = Maths
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                System.out.print(subject + " marks: ");
                int mark = sc.nextInt();

                // Check for negative marks
                if (mark < 0 || mark > 100) {
                    System.out.println("Invalid marks. Please enter marks between 0 and 100.");
                    j--; // repeat this subject input
                } else {
                    marks[i][j] = mark;
                }
            }

            // Calculate percentage
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = total / 3.0;

            // Assign grade
            if (percentage[i] >= 90) {
                grade[i] = 'A';
            } else if (percentage[i] >= 80) {
                grade[i] = 'B';
            } else if (percentage[i] >= 70) {
                grade[i] = 'C';
            } else if (percentage[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }

        // Display results
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            System.out.printf("Student %d:\n", (i + 1));
            System.out.println("Physics: " + marks[i][0]);
            System.out.println("Chemistry: " + marks[i][1]);
            System.out.println("Maths: " + marks[i][2]);
            System.out.printf("Percentage: %.2f%%\n", percentage[i]);
            System.out.println("Grade: " + grade[i]);
            System.out.println();
        }

        sc.close();
    }
}
