/*Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, 
each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]*/

package harshada.Array3;

import java.util.Arrays;

public class Ass64_ReverseStrArrwthUpperAndLower {

	String reverseStringFirstCapitalRestLower(String input) {
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i);
		}
		// System.out.println(output.substring(0,1).toUpperCase()+output.substring(1).toLowerCase());
		return output.substring(0, 1).toUpperCase() + output.substring(1).toLowerCase();
	}

	String[] reverseStrArrAndPlaceInReverseOrder(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			output[arr.length - 1 - i] = reverseStringFirstCapitalRestLower(arr[i]);// reversing each array element and
																					// placing in
			// reverse order
		}
		return output;
	}

	public static void main(String[] args) {
		Ass64_ReverseStrArrwthUpperAndLower ass64 = new Ass64_ReverseStrArrwthUpperAndLower();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = ass64.reverseStrArrAndPlaceInReverseOrder(input);
		System.out.println("Original Array is " + Arrays.toString(input));
		System.out.println("Reversed Array with First Later of word in Uppercase and remaining in lower case is "
				+ Arrays.toString(output));
	}

}
