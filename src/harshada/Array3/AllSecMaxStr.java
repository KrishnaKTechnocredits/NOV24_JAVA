/*Assignment - 59 : 21th Dec'2024 [25 mins]
print all the second maximum length string from given array.

input : {"Tech", "Tech", "Technocredits", "aashvi","GlobantPune","Ashvik", "PuneGlobant","Pune", "PuGlobantne"}
ouput : GlobantPune
        PuneGlobant
		PuGlobantne*/

package harshada.Array3;

import java.util.Arrays;

import ravindra.SecondMaxStrignFromArray58;

public class AllSecMaxStr {

	public static void main(String[] args) {
		AllSecMaxStr allSecMaxStr = new AllSecMaxStr();
		String[] input = { "Tech", "Tech", "Technocredits", "aashvi", "GlobantPune", "Ashvik", "PuneGlobant", "Pune",
				"PuGlobantne" };
		allSecMaxStr.findSecMaxStrFromArray(input);
	}

	void findSecMaxStrFromArray(String[] arr) {
		String MaxStr = arr[0];
		String SecMaxStr = arr[1];

		if (MaxStr.length() < SecMaxStr.length()) {
			MaxStr = arr[1];
			SecMaxStr = arr[0];
		}

		for (int j = 2; j < arr.length; j++) {
			if (MaxStr.length() < arr[j].length()) {
				SecMaxStr = MaxStr;
				MaxStr = arr[j];
			} else if (SecMaxStr.length() <= arr[j].length()) {
				SecMaxStr = arr[j];

			}
		}
		printAllStrwithGivenLegnth(arr, SecMaxStr.length());
		//System.out.println("Second maximum length String from array is " + SecMaxStr + " and String length is "	+ SecMaxStr.length());
	}

	void printAllStrwithGivenLegnth(String[] input, int SecMaxStrLen) {
		String str = "";
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == SecMaxStrLen) {
				str += input[i] + " ";
			}
		}
		System.out.println(str);
	}

}
