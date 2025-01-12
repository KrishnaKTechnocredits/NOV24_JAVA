/*
 * Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};
 */

package amruta.ProgramTest1;

import java.util.Arrays;

public class Program2 {

	String reverseString(String str) {
		String revString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			revString += str.charAt(index);
		}
		return revString;
	}

	String countVowel(String str) {
		int vowelCount = 0;
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vowelCount++;
		}
		if (vowelCount > 1)
			output = reverseString(str);
		else
			output = str;
		return output;
	}

	void takeArray(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			arr[index] = countVowel(arr[index]);
		}
		System.out.println("Output Array - " + Arrays.toString(arr));
	}

	public static void main(String[] args) {
		String[] input = { "apple", "sky", "orange", "try", "eagle" };
		System.out.println("Given Array - " + Arrays.toString(input));
		new Program2().takeArray(input);
	}
}
