/*Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order. each word in lowercase

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderC, ivhsaa, hcet]*/

package harshada.Array3;

import java.util.Arrays;

public class Ass63_ReverseStrInReverseOrderLowerCase {

	String reverseStringInLowerCase(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output.toLowerCase();// returning array in lower case
	}

	String[] reverseStrArrAndPlaceInReverseOrder(String[] arr) {
		String[] output = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			output[arr.length - 1 - i] = reverseStringInLowerCase(arr[i]);// reversing each array element and placing in
																			// reverse order
		}
		return output;
	}

	public static void main(String[] args) {
		Ass63_ReverseStrInReverseOrderLowerCase ass63 = new Ass63_ReverseStrInReverseOrderLowerCase();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = ass63.reverseStrArrAndPlaceInReverseOrder(input);
		System.out.println("Original Array is " + Arrays.toString(input));
		System.out.println("Reversed Array in lower case is " + Arrays.toString(output));
	}
}
