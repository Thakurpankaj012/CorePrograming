//Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
//I/P => NONE
//O/P => Sam’s average mark in PCM is ___

public class Level1Q2 {
    public static void main(String[] args) {
        // Sam's marks in each subject
        int maths = 94;
        int physics = 95;
        int chemistry = 96;

        // Calculate total and average
        int total = maths + physics + chemistry;
        double average = total / 3.0;

        // Output the result
        System.out.println("Sam’s average mark in PCM is " + average);
    }
}
