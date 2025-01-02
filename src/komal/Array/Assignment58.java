
//Assignment - 58 : 21th Dec'2024 [15 mins]   -----[my time 30min]
//Return the second maximum length string from given array.
//If you find multiple string as second maximum, return the last second maximum.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : PuGlobantne

//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : GlobantPune
//        PuneGlobant
//		PuGlobantne
package komal.Array;

public class Assignment58 {

	String getSecondMaximumStrLen(String[] input) {

		String maxName = input[0];
		String secondmaxName = input[1];
		if (secondmaxName.length() > maxName.length()) {
			maxName = input[1];
			secondmaxName = input[0];
		}
		for (int i = 2; i < input.length; i++) {
			if (maxName.length() < input[i].length()) {
				secondmaxName = maxName;
				maxName = input[i];
			} else if (secondmaxName.length() <= input[i].length()) {
				// This condn give 1st second max string if same str repeated
				secondmaxName = input[i];
			}
			// else if (secondmaxName.length() < input[i].length()) // This conn give first
			// second max str
		}

//		System.out.println(secondmaxName + "and" + maxName);
		return secondmaxName;

	}

	void getSecondMaxAllStr(String[] input, int len) {
		String secondMax = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == len) {
				secondMax = secondMax + "\n" + input[i];
			}
		}
		System.out.println("All second max string are => " + secondMax);
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment58 a58 = new Assignment58();
		String getSecondMaxName = a58.getSecondMaximumStrLen(input);
		a58.getSecondMaxAllStr(input, getSecondMaxName.length());
		System.out.print("Second max string => " + getSecondMaxName);
	}
}
