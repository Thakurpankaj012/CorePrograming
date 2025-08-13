import java.util.Random;

public class VotingEligibility {
    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        Random rand = new Random();
        for (int i = 0; i < count; i++) {
            ages[i] = rand.nextInt(90); // generate age from 0 to 89
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            result[i][1] = (ages[i] >= 18) ? "Can Vote" : "Cannot Vote";
        }
        return result;
    }

    public static void display(String[][] data) {
        System.out.println("Age	Eligibility");
        for (String[] row : data) {
            System.out.println(row[0] + "	" + row[1]);
        }
    }

    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] eligibility = checkEligibility(ages);
        display(eligibility);
    }
}
