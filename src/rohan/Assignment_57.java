/*
 * Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits

 */

package rohan;

public class Assignment_57 {

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "aashvi", "GlobantPune", "Ashvik", "Technocredits", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_57 assignment = new Assignment_57();
		String str = assignment.CalcMaxString(input);
		System.out.println("Output:" + str);
	}

	String CalcMaxString(String[] input) {
		String str = null;
		int Max = input[0].length();
		for (int i = 1; i < input.length; i++) {
			if (Max < input[i].length()) {
				Max = input[i].length();
				str = input[i];
			}

		}

		return str;
	}

}
