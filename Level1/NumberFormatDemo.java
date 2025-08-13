import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed: " + number);
    }

    public static void handleException(String input) {
        try {
            int number = Integer.parseInt(input);
            System.out.println("Parsed: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.next();
        handleException(input);
    }
}