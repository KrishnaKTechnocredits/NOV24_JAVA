package swapnilArray;

import java.util.Arrays;

public class Assignment64 {

	String getFirstLetterUpparCase(String word) {
		return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
	}

	String revWord(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);
		}
		return revWord;
	}

	String[] revArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String word = revWord(input[i]);

			output[j] = getFirstLetterUpparCase(word);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		Assignment64 a = new Assignment64();
		String[] output = a.revArray(input);
		System.out.println(Arrays.toString(output));
	}
}
