package pooja.array;

import java.util.Arrays;

/*Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
*/
public class Assignment_57 {

	String getMaxLengthStringFromArray(String[] input) {
		String max = input[0];
		for (int i = 0; i < input.length; i++) {
			if (max.length() < input[i].length()) {
				max = input[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment_57 assignment_57 = new Assignment_57();
		String ans = assignment_57.getMaxLengthStringFromArray(input);
		System.out.println("The given String arrays is : " + Arrays.toString(input) + "\n"
				+ "The maxximum length from given string array is : " + ans);
	}
}