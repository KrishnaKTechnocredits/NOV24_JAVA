package pranita;

public class DigitCountInWordsAss70 {

	public static void printDigitCountInWords(String input) {
        String[] words = input.split(" ");

        for (String word : words) {
            int digitCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    digitCount++;
                }
            }
            System.out.println(word + " -> " + digitCount);
        }
    }

    public static void main(String[] args) {
        String str = "H2i22 H1ello Techno C2red3i3t4s5";
        printDigitCountInWords(str);
    }
}
