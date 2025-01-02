
//Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.
//
//Example:
//Input:
//String[] input = {"apple", "sky", "orange", "try", "eagle"};
//Output:
//String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};

package komal.ProgramTest;

import java.util.Arrays;

public class Test2 {
	boolean checkForViowels(String input) {
		String vowel = "aeiou";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (vowel.indexOf(ch) != -1) {
				return true;
			}
		}
		return false;
	}

	String getReverseword(String input) {
		String reverse = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + input.charAt(i);
		}
		return reverse;
	}

	void getReverseString(String[] input) {
		String[] revArray = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			boolean output = checkForViowels(input[i]);
			if (output) {
				revArray[i] = getReverseword(input[i]);
			} else {
				revArray[i] = input[i];
			}
		}
		System.out.println("Output Array is :" + Arrays.toString(revArray));
	}

	public static void main(String[] args) {

		Test2 t2 = new Test2();
		String[] input = { "apple", "sky", "orange", "try", "eagle" };
		t2.getReverseString(input);
	}
}
