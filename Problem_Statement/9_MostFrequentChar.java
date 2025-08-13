public class MostFrequentChar {
    public static void main(String[] args) {
        String input = "success";
        int[] freq = new int[256];
        for (char ch : input.toCharArray()) {
            freq[ch]++;
        }

        char mostFrequent = ' ';
        int max = 0;
        for (char ch : input.toCharArray()) {
            if (freq[ch] > max) {
                max = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}
