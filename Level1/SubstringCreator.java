import java.util.Scanner;

public class SubstringCreator {
    public static String substringUsingCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++)
            result += text.charAt(i);
        return result;
    }

    public static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        System.out.print("Start index: ");
        int start = sc.nextInt();
        System.out.print("End index: ");
        int end = sc.nextInt();

        String sub1 = substringUsingCharAt(text, start, end);
        String sub2 = text.substring(start, end);
        System.out.println("Custom: " + sub1);
        System.out.println("Built-in: " + sub2);
        System.out.println("Equal? " + compareStrings(sub1, sub2));
    }
}