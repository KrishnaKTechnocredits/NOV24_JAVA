package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 63 : 22nd Dec'2024 [IMP]
 * 
 * Reverse each string in array and place at in reverse order, all letters in
 * each string should be lower case only.
 * 
 * Input : {"TeCh", "Aashvi", "Credits", "AnsH"}
 * 
 * Output : [hsna, stiderc, ivhsaa, hcet]
 */

public class Assignment63 {

	String getReverseWordInLowerCase(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output.toLowerCase();
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = getReverseWordInLowerCase(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out.println("Reverse array with reverse words in lower case - "
				+ Arrays.toString(assignment63.getReverseArray(input)));
	}

}