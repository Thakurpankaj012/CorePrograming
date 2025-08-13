import java.util.Scanner;

public class VowelConsonantType {
    public static String getCharType(char c) {
        if (!Character.isLetter(c)) return "Not a Letter";
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vowel" : "Consonant";
    }

    public static String[][] analyzeCharacters(String input) {
        String[][] result = new String[input.length()][2];
        for (int i = 0; i < input.length(); i++) {
            result[i][0] = String.valueOf(input.charAt(i));
            result[i][1] = getCharType(input.charAt(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = analyzeCharacters(input);
        System.out.println("Character	Type");
        for (String[] row : result) {
            System.out.println(row[0] + "		" + row[1]);
        }
    }
}
