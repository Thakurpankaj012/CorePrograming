import java.util.Scanner;

public class SplitTextIntoWords {
    public static String[] splitWords(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') wordCount++;
        }

        String[] words = new String[wordCount];
        StringBuilder sb = new StringBuilder();
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = sb.toString();
                sb.setLength(0);
            } else {
                sb.append(text.charAt(i));
            }
        }
        words[index] = sb.toString();
        return words;
    }

    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] customSplit = splitWords(input);
        String[] builtInSplit = input.split(" ");

        System.out.println("Words using custom split:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        boolean areEqual = compareArrays(customSplit, builtInSplit);
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
