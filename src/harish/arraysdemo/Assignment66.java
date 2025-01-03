package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 66 : 22nd Dec'2024
 * 
 * Reverse word in array at the same place provided word should not have any
 * digit, if word is having any digit do not reverse the word.
 * 
 * Input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
 * 
 * Output : [hcet, aashvi, stiderc, H4i, olleH]
 */

public class Assignment66 {

	// method to check if given word contains any digit
	boolean isDigitPresentInWord(String input) {
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	// method to reverse a given word, if word contains any digit then do not
	// reverse it
	String getReverseOfWord(String input) {
		String output = "";
		if (!isDigitPresentInWord(input)) {
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
		} else {
			return input;
		}
		return output;
	}

	String[] reverseStringInArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = getReverseOfWord(input[i]);
		}
		return output;
	}

	public final static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out.println("Reverse array with reverse words which do not have digits - "
				+ Arrays.toString(assignment66.reverseStringInArray(input)));
	}

}