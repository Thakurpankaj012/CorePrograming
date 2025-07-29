// Suppose you have to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.
//Hint =>
//Use Modulus Operator (%) to find the reminder.
//Use Division Operator to find the Quantity of pens
//I/P => NONE
//O/P => The Pen Per Student is ___ and the remaining pen not distributed is ___

public class Level1Q5 {
    public static void main(String[] args) {
        // Total number of pens
        int totalPens = 14;
        // Number of students
        int students = 3;

        // Calculate pens per student and remaining pens
        int pensPerStudent = totalPens / students;
        int remainingPens = totalPens % students;

        // Output the result
        System.out.println("The Pen Per Student is " + pensPerStudent);
        System.out.println("The remaining pen not distributed is " + remainingPens);
    }
}