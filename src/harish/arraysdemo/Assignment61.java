package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 61 : 22nd Dec'2024[IMP]
 * 
 * Reverse each string in array at the same place.
 * 
 * input : {"tech", "aashvi", "credits"} output : [hcet, ivhsaa, stiderc]
 */

public class Assignment61 {

	String getReverseOfWord(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
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

	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		String[] input = { "tech", "aashvi", "credits" };
		System.out.println("Given string array - " + Arrays.toString(input));

		String[] reverseStringInArray = assignment61.reverseStringInArray(input);
		System.out.println("Reverse strings in array - " + Arrays.toString(reverseStringInArray));
	}
}