import java.util.Scanner;

public class ShortestAndLongestWord {
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

    public static int getLength(String word) {
        int length = 0;
        try {
            while (true) {
                word.charAt(length++);
            }
        } catch (Exception e) {}
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();
        String[] words = splitWords(input);

        String shortest = words[0];
        String longest = words[0];

        for (String word : words) {
            if (getLength(word) < getLength(shortest)) shortest = word;
            if (getLength(word) > getLength(longest)) longest = word;
        }

        System.out.println("Shortest word: " + shortest);
        System.out.println("Longest word: " + longest);
    }
}
