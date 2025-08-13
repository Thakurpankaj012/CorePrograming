public class RemoveSpecificChar {
    public static void main(String[] args) {
        String input = "Hello World";
        char removeChar = 'l';
        String result = "";

        for (char ch : input.toCharArray()) {
            if (ch != removeChar) {
                result += ch;
            }
        }

        System.out.println("Modified String: " + result);
    }
}
