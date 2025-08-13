import java.util.Random;

public class StudentGradeCalculator {
    public static int[][] generateMarks(int students) {
        Random rand = new Random();
        int[][] marks = new int[students][3];
        for (int i = 0; i < students; i++) {
            marks[i][0] = 40 + rand.nextInt(61); // physics
            marks[i][1] = 40 + rand.nextInt(61); // chemistry
            marks[i][2] = 40 + rand.nextInt(61); // math
        }
        return marks;
    }

    public static String[][] calculateGrades(int[][] marks) {
        String[][] result = new String[marks.length][6];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = total / 3.0;

            String grade;
            if (percentage >= 90) grade = "A+";
            else if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else grade = "F";

            result[i][0] = String.valueOf(marks[i][0]);
            result[i][1] = String.valueOf(marks[i][1]);
            result[i][2] = String.valueOf(marks[i][2]);
            result[i][3] = String.valueOf(total);
            result[i][4] = String.format("%.2f", percentage);
            result[i][5] = grade;
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Phy	Chem	Math	Total	%	Grade");
        for (String[] row : data) {
            for (String val : row) {
                System.out.print(val + "	");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] marks = generateMarks(10);
        String[][] grades = calculateGrades(marks);
        display(grades);
    }
}
