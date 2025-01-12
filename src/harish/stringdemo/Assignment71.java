package harish.stringdemo;

/**
 * Assignment - 71 : 5th Jan'2025 [IMP]
 * 
 * Return the word having highest digits in the given String .
 * 
 * Input : String str = "H2i22 H1ello Techno C2red3i3t4s5";
 * 
 * Output : C2red3i3t4s5
 */

public class Assignment71 {

	private int getDigitFrequencyInWord(String input) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				count++;
			}
		}
		return count;
	}

	private String getWordWithMaxDigits(String[] input) {
		String output = input[0];
		int currentMaxDigitCount = getDigitFrequencyInWord(input[0]);
		for (int i = 1; i < input.length; i++) {
			if (getDigitFrequencyInWord(input[i]) > currentMaxDigitCount) {
				currentMaxDigitCount = getDigitFrequencyInWord(input[i]);
				output = input[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input - " + str);
		String[] inputStringArray = str.split(" ");
		System.out.println("Output : " + new Assignment71().getWordWithMaxDigits(inputStringArray));
	}
}