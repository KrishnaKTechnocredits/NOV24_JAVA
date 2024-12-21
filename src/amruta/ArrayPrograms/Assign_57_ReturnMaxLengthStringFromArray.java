/*
Assignment - 57 : 21th Dec'2024 [15 mins]
Return the maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : Technocredits
*/

package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_57_ReturnMaxLengthStringFromArray {

	// Logic 1
	String returnMaxLengthString(String[] arr) {
		int maxLength = 0;
		String maxLengthString = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLengthString = arr[index];
				maxLength = arr[index].length();
			}
		}
		return maxLengthString;
	}

	// Logic 2
	void printMaxLengthStringFromAArray(String[] arr) {
		String maxlenString = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxlenString.length())
				maxlenString = arr[index];
		}
		System.out.println("String having Maximum length in given Array is ---> " + maxlenString);
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		Assign_57_ReturnMaxLengthStringFromArray a57 = new Assign_57_ReturnMaxLengthStringFromArray();
		String str = a57.returnMaxLengthString(input);
		System.out.println("Given Array is - " + Arrays.toString(input));
		System.out.println("String having Maximum length in given Array is ---> " + str);
		System.out.println(
				"----------------------------------------------------------------------------------------------------");
		String[] arr = { "amruta", "sonalii", "tushar", "jitu" };
		System.out.println("Given Array is - " + Arrays.toString(arr));
		a57.printMaxLengthStringFromAArray(arr);
	}
}