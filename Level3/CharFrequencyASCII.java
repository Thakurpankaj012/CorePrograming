import java.util.Scanner;

public class CharFrequencyASCII {
    public static int[] calculateFrequency(String text) {
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }
        return freq;
    }

    public static void displayFrequencies(String text, int[] freq) {
        boolean[] shown = new boolean[256];
        System.out.println("Char	Frequency");
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!shown[ch]) {
                System.out.println(ch + "	" + freq[ch]);
                shown[ch] = true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        int[] frequencies = calculateFrequency(input);
        displayFrequencies(input, frequencies);
    }
}
