/*
 * Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
 */

package rohan;

public class Assignment_58 {

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "aashvi", "GlobantPune", "Ashvik", "Technocredits", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_58 assignment = new Assignment_58();
		String str = assignment.CalcSecMaxName(input);
		System.out.println("Output:" + str);
	}

	String CalcSecMaxName(String[] input) {
		String maxName = input[0];
		String SecMaxName = input[1];
		if (maxName.length() < input[1].length()) {
			SecMaxName = maxName;
			maxName = input[1];
		}
		for (int i = 2; i < input.length; i++) {
			if (maxName.length() <= input[i].length()) {
				SecMaxName = maxName;
				maxName = input[i];
			} else if (SecMaxName.length() <= input[i].length()) {
				SecMaxName = input[i];
			}
		}
		return SecMaxName;
	}

}
