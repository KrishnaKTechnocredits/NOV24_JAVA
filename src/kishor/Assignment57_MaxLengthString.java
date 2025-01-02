package kishor;
//Return the maximum length string from given array.

//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"

public class Assignment57_MaxLengthString {

	String getMaxLengthString(String[] input) {
		String maxString = input[0];
		for (int i = 1; i < input.length; i++) {
			if (input[i].length() > maxString.length()) {
				maxString = input[i];
			}
		}
		return maxString;
	}

	public static void main(String[] args) {
		String[] arr = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assignment57_MaxLengthString assignment57 = new Assignment57_MaxLengthString();
		String ans = assignment57.getMaxLengthString(arr);
		System.out.println("The max length string in given array is:- " + ans);
	}
}
