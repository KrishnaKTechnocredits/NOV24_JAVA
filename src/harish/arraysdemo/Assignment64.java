package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 64 : 22nd Dec'2024
 * 
 * Reverse each string in array and place at in reverse order, each word first
 * letter capital and rest in lowercase.
 * 
 * Input : {"Tech", "Aashvi", "Credits", "Ansh"}
 * 
 * Output : [Hsna,Stiderc, Ivhsaa, Hcet]
 */

public class Assignment64 {

	String formatOutput(String input) {
		return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
	}

	String getReverseWord(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return formatOutput(output);
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = getReverseWord(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment64 assignment64 = new Assignment64();
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out.println("Reverse array with reverse words with first letter captial and others lower case - "
				+ Arrays.toString(assignment64.getReverseArray(input)));
	}
}