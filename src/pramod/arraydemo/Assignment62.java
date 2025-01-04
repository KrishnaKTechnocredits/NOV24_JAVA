/*
Assignment - 62 : 22nd Dec'2024 [20 min] [IMP] [12 mins]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet]

*/


package pramod.arraydemo;

import java.util.*;

class Assignment62 {

	String getReverseWord(String word) {
		String output = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			char ch = word.charAt(i);
			output = output + ch;
		}
		return output;
	}

	void printStringInReverseInReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			output[j] = getReverseWord(input[i]);
		}
		System.out.println("Reverse string in reverse order: " + Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment62 A62 = new Assignment62();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		System.out.println("Given string array is: " + Arrays.toString(input));
		A62.printStringInReverseInReverseArray(input);
	}
}