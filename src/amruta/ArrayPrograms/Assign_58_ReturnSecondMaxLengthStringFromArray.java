/*
Assignment - 58 : 21th Dec'2024 [15 mins]
Return the second maximum length string from given array.
If you find multiple string as second maximum, return the last second maximum.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : PuGlobantne
*/

package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_58_ReturnSecondMaxLengthStringFromArray {

	String returnSecondMaxLengthString(String[] arr) {
		String maxLengthString = "";
		String secondMaxLengthString = "";

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLengthString.length()) {
				secondMaxLengthString = maxLengthString;
				maxLengthString = arr[index];
			} else {
				if (arr[index].length() >= secondMaxLengthString.length())
					secondMaxLengthString = arr[index];
			}
		}
		// System.out.println(maxLengthString);
		return secondMaxLengthString;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given Array is --> " + Arrays.toString(input));

		Assign_58_ReturnSecondMaxLengthStringFromArray a58 = new Assign_58_ReturnSecondMaxLengthStringFromArray();
		String str = a58.returnSecondMaxLengthString(input);
		System.out.println("Second Maximum length String in given Array is ---> " + str);
	}
}