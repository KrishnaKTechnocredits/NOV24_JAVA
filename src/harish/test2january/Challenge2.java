package harish.test2january;

import java.util.Arrays;
import java.util.List;

/**
 * Challenge - 2: 2nd Jan 2025 [Time taken - 7 minutes]
 * 
 * Given an array of strings, reverse each string in the array only if the
 * string contains more than one vowel (a, e, i, o, u). The resulting array
 * should reflect the modifications.
 * 
 * Example:
 * 
 * Input: String[] input = {"apple", "sky", "orange", "try", "eagle"};
 * 
 * Output: String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};
 */

public class Challenge2 {

	// method to check number of vowels in given word
	private int checkNumberOfVowelsInWord(String input) {
		int count = 0;
		// declaring a list of vowels
		List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');
		for (int i = 0; i < input.length(); i++) {
			// check element at each index is vowels or not, if yes then increase count
			if (vowels.contains(Character.toLowerCase(input.charAt(i)))) {
				count++;
			}
		}
		return count;
	}

	// method to reverse a word only if it contains more than 1 vowel
	private String getReverseOfWord(String input) {
		String output = "";
		if (checkNumberOfVowelsInWord(input) > 1) {
			for (int i = input.length() - 1; i >= 0; i--) {
				output += input.charAt(i);
			}
		} else {
			return input;
		}

		return output;
	}

	/**
	 * method to return a new array where each word is reversed if it contains more
	 * than 1 vowel
	 */
	public String[] getReverseStringInArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = getReverseOfWord(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		Challenge2 challenge2 = new Challenge2();
		String[] input = { "apple", "sky", "orange", "try", "eagle" };
		System.out.println("Original array - " + Arrays.toString(input));
		System.out.println("Resulting array - " + Arrays.toString(challenge2.getReverseStringInArray(input)));
	}
}