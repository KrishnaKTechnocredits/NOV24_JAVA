/*
Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne
*/

package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_59_PrintSecondMaxLengthStringsFromGivenArray {

	void printSecondMaxLengthStrings(String[] arr, String secondMaxLengthString) {
		System.out.println("Second Max Length String in a givan Array are : ");
		for (int index = 0; index < arr.length; index++) {
			if (secondMaxLengthString.length() == arr[index].length()) {
				System.out.println(arr[index]);
			}
		}
	}

	void findSecondMaxLengthStringsFromArray(String[] arr) {
		String maxLengthString = "";
		String secondMaxLengthString = "";
		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() > maxLengthString.length()) {
				secondMaxLengthString = maxLengthString;
				maxLengthString = arr[index];
			} else {
				if (arr[index].length() >= secondMaxLengthString.length()) {
					secondMaxLengthString = arr[index];
				}
			}
		}
		printSecondMaxLengthStrings(arr, secondMaxLengthString);
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		System.out.println("Given Array is ---> " + Arrays.toString(input));

		Assign_59_PrintSecondMaxLengthStringsFromGivenArray a59 = new Assign_59_PrintSecondMaxLengthStringsFromGivenArray();
		a59.findSecondMaxLengthStringsFromArray(input);
	}
}