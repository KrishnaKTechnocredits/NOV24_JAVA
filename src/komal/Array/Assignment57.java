//Assignment - 57 : 21th Dec'2024 [15 mins]   ----------------[yTime : 10minn]
//Return the maximum length string from given array.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : Technocredits

package komal.Array;

public class Assignment57 {
	String maxLengthStr;

	String getMaximumStringLength(String[] input) {

		int maxLength = input[0].length();
		for (int i = 1; i < input.length; i++) {
			if (maxLength < input[i].length()) {
				maxLength = input[i].length();
				maxLengthStr = input[i];
			}
		}
		System.out.println(maxLengthStr + "=>" + maxLength);
		return maxLengthStr;
	}

	public static void main(String args[]) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment57 a57 = new Assignment57();
		String output = a57.getMaximumStringLength(input);
		System.out.println("Maximum length string from given array is" + "=>" + output);
	}
}
