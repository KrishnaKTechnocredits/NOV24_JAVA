/*
Assignment - 59 : 21th Dec'2024 [25 mins] [20 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
*/

package pramod.arraydemo;

import java.util.*;

class Assignment59 {

	void getSecondMaximumString(String[] input) {
		String maxString = input[0], secondMaxString = input[1];
		if (maxString.length() < secondMaxString.length()) {
			maxString = input[1];
			secondMaxString = input[0];

		}
		for (int i = 1; i < input.length; i++) {
			if (maxString.length() < input[i].length()) {
				secondMaxString = maxString;
				maxString = input[i];
			} else if (secondMaxString.length() <= input[i].length()) {
				secondMaxString = input[i];
			}

		}
		printSecondMaxString(input, secondMaxString.length());
	}

	void printSecondMaxString(String[] input, int targetedLength) {
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == targetedLength) {
				System.out.println(input[i]);
			}
		}
	}

	public static void main(String[] args) {
		Assignment59 A59 = new Assignment59();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given String is :" + Arrays.toString(input));
		System.out.println("All second maximum string as below : ");
		A59.getSecondMaximumString(input);

	}
}
