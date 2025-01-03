package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 62 : 22nd Dec'2024 [IMP]
 * 
 * Reverse each string in array and place at in reverse order.
 * 
 * Input : {"tech", "aashvi", "Credits", "Ansh"}
 * 
 * Output : [hsnA, stiderC, ivhsaa, hcet]
 */

public class Assignment62 {

	String getReverseWord(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = getReverseWord(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out
				.println("Reverse array with reverse words - " + Arrays.toString(assignment62.getReverseArray(input)));
	}
}