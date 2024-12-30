package pooja.array;

import java.util.Arrays;

/*Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
*/
public class Assignment_58 {

	String getSecondMaxStringFromArray(String[] input) {
		String maxString = input[0];
		String secondMaxString = input[1];

		if (maxString.length() > secondMaxString.length()) {
			maxString = input[1];
			secondMaxString = input[0];
		}
		for (int i = 2; i < input.length; i++) {
			if (maxString.length() < input[i].length()) {
				secondMaxString = maxString;
				maxString = input[i];
			} else if (input[i].length() >= secondMaxString.length()) {
				secondMaxString = input[i];
			}
		}
		return secondMaxString;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_58 assignment_58 = new Assignment_58();
		String ans = assignment_58.getSecondMaxStringFromArray(input);
		System.out.println("The given string array is : " + Arrays.toString(input) + "\n"
				+ "The second maximum string from given array is : " + ans);
	}
}