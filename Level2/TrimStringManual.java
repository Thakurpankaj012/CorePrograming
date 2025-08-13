import java.util.Scanner;

public class TrimStringManual {
    public static int[] findTrimIndices(String input) {
        int start = 0;
        while (start < input.length() && input.charAt(start) == ' ') start++;
        int end = input.length() - 1;
        while (end >= 0 && input.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    public static String manualSubstring(String input, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with spaces: ");
        String input = sc.nextLine();
        int[] indices = findTrimIndices(input);
        String trimmedManual = manualSubstring(input, indices[0], indices[1]);
        String trimmedBuiltIn = input.trim();
        System.out.println("Manual Trim: [" + trimmedManual + "]");
        System.out.println("Built-in Trim: [" + trimmedBuiltIn + "]");
        System.out.println("Are both trims equal? " + compareStrings(trimmedManual, trimmedBuiltIn));
    }
}
