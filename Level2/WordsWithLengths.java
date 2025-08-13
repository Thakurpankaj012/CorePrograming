import java.util.Scanner;

public class WordsWithLengths {
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

    public static String[][] getWordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        String[] words = splitWords(input);
        String[][] result = getWordsWithLengths(words);

        System.out.println("Word	Length");
        for (String[] row : result) {
            System.out.println(row[0] + "	" + row[1]);
        }
    }
}
