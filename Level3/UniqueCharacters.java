import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String s) {
        int length = 0;
        try {
            while (true) s.charAt(length++);
        } catch (Exception e) {}
        return length;
    }

    public static char[] findUniqueChars(String text) {
        int len = getLength(text);
        char[] unique = new char[len];
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == ch) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) unique[index++] = ch;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        char[] unique = findUniqueChars(input);
        System.out.print("Unique characters: ");
        for (char ch : unique) System.out.print(ch + " ");
    }
}
