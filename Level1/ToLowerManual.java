import java.util.Scanner;

public class ToLowerManual {
    public static String toLower(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') c += 32;
            result += c;
        }
        return result;
    }

    public static boolean compare(String a, String b) {
        return a.equals(b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String custom = toLower(text);
        String builtin = text.toLowerCase();
        System.out.println("Equal? " + compare(custom, builtin));
    }
}