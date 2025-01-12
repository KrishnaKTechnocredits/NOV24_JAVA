/*
Assignment - 58 : 21th Dec'2024 [15 mins] [20 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
*/
package pramod.arraydemo;

import java.util.*;

class Assignment58 {

	String getSecondMaxString(String[] input) {
		String maxString = input[0], secondMaxString = input[1];
		int maxStringLen = input[0].length(), secondMaxStringLen = input[1].length();
		for (int i = 1; i < input.length; i++) {
			if (maxStringLen < input[i].length()) {
				secondMaxString = maxString;
				maxString = input[i];
				maxStringLen = maxString.length();
				secondMaxStringLen = secondMaxString.length();
			} else if (secondMaxStringLen <= input[i].length()) {
				secondMaxString = input[i];
				secondMaxStringLen = secondMaxString.length();
			}
		}
		return secondMaxString;
	}

	public static void main(String[] args) {
		Assignment58 A58 = new Assignment58();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given String is: " + Arrays.toString(input));
		String output = A58.getSecondMaxString(input);
		System.out.println("Second maximum string which is last: " + output);
	}
}