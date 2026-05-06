package swapnilArray;

import java.util.Arrays;

public class Assignment66 {

	String revWord(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			output = output + word.charAt(i);
		}
		return output;
	}

	boolean getDigitWord(String word) {
		boolean flag = false;
		for (int i = 0; i <= word.length() - 1; i++) {
			char ch = word.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	String getWordWithoutDigit(String word) {
		String output = "";
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	String[] getArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			if (getDigitWord(input[i])) {
				output[i] = getWordWithoutDigit(input[i]);
			} else {
				output[i] = revWord(input[i]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		Assignment66 a = new Assignment66();
		String[] output = a.getArray(input);
		System.out.println(Arrays.toString(output));
	}
}
