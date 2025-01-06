package pranita;

public class WordFrequencyAss69 {

    public static void printWordFrequency(String input) {
        String[] words = input.split(" ");
        boolean[] visited = new boolean[words.length];

        for (int i = 0; i < words.length; i++) {
            if (visited[i]) {
                continue; // Skip already processed words
            }

            int count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    visited[j] = true; // Mark as processed
                }
            }
            System.out.println(words[i] + " -> " + count);
        }
    }

    public static void main(String[] args) {
        String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
        printWordFrequency(str);
    }
}
