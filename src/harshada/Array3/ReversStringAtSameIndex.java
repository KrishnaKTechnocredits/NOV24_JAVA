/*Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]*/

package harshada.Array3;

import java.util.Arrays;

public class ReversStringAtSameIndex {

	String reverseString(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char ch = str.charAt(i);
			output += ch;
		}
		//System.out.println(output);
		return output;
	}

	String[] reverseStringAtSamePlace(String[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] = reverseString(input[i]);// getting reversed string from reverseString method and storing at same
												// // index
		}
		return input;
	}

	public static void main(String[] args) {
		ReversStringAtSameIndex r = new ReversStringAtSameIndex();
		String[] arr = { "tech", "aashvi", "credits" };
		String[] output = r.reverseStringAtSamePlace(arr);
		System.out.println(Arrays.toString(output));
	}
}
