package vrushali.arrayProgram;

//Assignment - 58 : 21th Dec'2024 [15 mins]
//Return the second maximum length string from given array.
//If you find multiple string as second maximum, return the last second maximum.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : PuGlobantne

public class ReturnSecondLongestStringFromArray {
	String reurnSecondLongestSTringFromStringArray(String[] strArray) {
		String secondLongest = strArray[0];
		String longest = strArray[1];
		if (strArray[0].length() > strArray[1].length()) {
			secondLongest = strArray[1];
			longest = strArray[0];
		}

		for (int i = 2; i < strArray.length; i++) {
			if (longest.length() < strArray[i].length()) {
				secondLongest = longest;
				longest = strArray[i];
			} else if (secondLongest.length() <= strArray[i].length()) {
				secondLongest = strArray[i];
			}
		}

		return secondLongest;
	}

	void printAllWordOfSecondLongest(String[] strArray, int seconndLongestLength) {
		System.out.println("Second Longest Strings In Array:-");
		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i].length() == seconndLongestLength) {
				System.out.println(strArray[i]);
			}
		}
	}

	public static void main(String[] args) {
		ReturnSecondLongestStringFromArray returnSecondLongestStringFromArray = new ReturnSecondLongestStringFromArray();
		String[] strArray = { "Tech", "Tecg", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlabantne" };
		String str = returnSecondLongestStringFromArray.reurnSecondLongestSTringFromStringArray(strArray);
		System.out.println("Second longest string in array:--" + str);
	}
}
