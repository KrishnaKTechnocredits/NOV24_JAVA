package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Assignment - 76 : 11th Jan
 * 
 * Return the list of names having at least one uppercase, one lowercase, one
 * digit and one special character (_, !, #, $) in the name.
 * 
 * Input : String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits",
 * "Tit!i1ksHa", "PUNE1#"};
 * 
 * Output : {"TEch1n_o##", "Tit!i1ksHa"}
 * 
 */

public class Assignment76 {

	private boolean processName(String name) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		for (int i = 0; i < name.length(); i++) {
			if (Character.isUpperCase(name.charAt(i))) {
				upperCaseCount += 1;
			} else if (Character.isLowerCase(name.charAt(i))) {
				lowerCaseCount += 1;
			} else if (Character.isDigit(name.charAt(i))) {
				digitCount += 1;
			} else {
				specialCharCount += 1;
			}
		}
		return (upperCaseCount > 0 && lowerCaseCount > 0 && digitCount > 0 && specialCharCount > 0);
	}

	private ArrayList<String> getNames(String[] input) {
		ArrayList<String> output = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			if (processName(input[i])) {
				output.add(input[i]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!i1ksHa", "PUNE1#" };
		System.out.println("Input : " + Arrays.toString(arr));
		Assignment76 assignment76 = new Assignment76();
		System.out.println("Output : " + assignment76.getNames(arr));
	}
}