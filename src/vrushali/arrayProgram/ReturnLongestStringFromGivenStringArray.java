package vrushali.arrayProgram;
//Assignment - 57 : 21th Dec'2024 [15 mins]
//Return the maximum length string from given array.
//
//input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
//ouput : Technocredits

public class ReturnLongestStringFromGivenStringArray {

	String returnLongestStringFromGivenStringArray(String[] stringArray) {
		String longestStr = "";
		longestStr = stringArray[0];
		for (int i = 0; i < stringArray.length; i++) {
			if (longestStr.length() < stringArray[i].length()) {
				longestStr = stringArray[i];
			}
		}
		return longestStr;
	}

	public static void main(String[] args) {
		ReturnLongestStringFromGivenStringArray returnLongestStringFromGivenStringArray = new ReturnLongestStringFromGivenStringArray();
		String[] strArray = { "Tech", "Tecg", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlabantne" };
		String str = returnLongestStringFromGivenStringArray.returnLongestStringFromGivenStringArray(strArray);
		System.out.println("Longest String in Array :- " + str);
	}

}
