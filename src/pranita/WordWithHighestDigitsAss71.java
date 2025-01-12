package pranita;

public class WordWithHighestDigitsAss71 {

    public static String getWordWithHighestDigits(String input) {
        String[] words = input.split(" ");
        String maxDigitWord = "";
        int maxDigitCount = 0;

        for (String word : words) {
            int digitCount = 0;
            for (int i = 0; i < word.length(); i++) {
                if (Character.isDigit(word.charAt(i))) {
                    digitCount++;
                }
            }
            if (digitCount > maxDigitCount) {
                maxDigitCount = digitCount;
                maxDigitWord = word;
            }
        }

        return maxDigitWord;
    }

    public static void main(String[] args) {
        String str = "H2i22 H1ello Techno C2red3i3t4s5";
        String result = getWordWithHighestDigits(str);
        System.out.println("Word with the highest digits is : " + result);
    }
}

