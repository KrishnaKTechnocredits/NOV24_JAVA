package swapnil;

import java.util.Arrays;

public class Assignment65 {

	String revWord(String word) {
		String revWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			revWord = revWord + word.charAt(i);
		}
		return revWord;
	}

	String getWordChar(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String getFirstLetterUpparCase(String word) {
		int j = word.length() - 1;
		return word.substring(0, 1).toUpperCase() + word.substring(1, j) + word.substring(j).toLowerCase();
	}

	String[] getArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String word = input[i];
			word = revWord(word);
			word = getWordChar(word);
			word = getFirstLetterUpparCase(word);
			output[j] = word;
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		Assignment65 a = new Assignment65();
		String[] output = a.getArray(input);
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
	}
}
