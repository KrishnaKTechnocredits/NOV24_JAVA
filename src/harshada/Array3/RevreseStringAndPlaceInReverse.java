/*Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.
input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet].*/

package harshada.Array3;

import java.util.Arrays;

public class RevreseStringAndPlaceInReverse {

	String reverseString(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}
		return output;
	}

	String[] reverseStringArrayAtReverseIndex(String[] input) {
		String[] output = new String[input.length];
		// defined 2 indexs to manage 2 String arrays
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			output[j] = reverseString(input[i]);// method reversing each string and putting it in new array in reverse
												// order
		}
		return output;
	}

	public static void main(String[] args) {
		RevreseStringAndPlaceInReverse r = new RevreseStringAndPlaceInReverse();
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		String[] output = r.reverseStringArrayAtReverseIndex(input);
		System.out.println("Original Array is " + Arrays.toString(input));
		System.out.println("Reversed Array is " + Arrays.toString(output));
	}
}
