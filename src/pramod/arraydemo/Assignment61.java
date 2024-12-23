/*
Assignment - 61 : 22nd Dec'2024 [20 min] [IMP] [15 mins]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
*/


package pramod.arraydemo;

import java.util.*;

class Assignment61 {

	String getStringInReverse(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			output = output + ch;
		}
		return output;
	}

	void printReverseStringInArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			output[i] = getStringInReverse(input[i]);
		}
		System.out.println("Rever string array is: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment61 A61 = new Assignment61();
		String[] input = { "tech", "aashvi", "credits" };
		System.out.println("Given array is: " + Arrays.toString(input));
		A61.printReverseStringInArray(input);

	}
}