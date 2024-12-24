/*
 * Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hcet]
 */

package rohan;

import java.util.Arrays;

public class Assignment_62 {

	public static void main(String[] args) {
		String[] input = { "tech", "aashvi", "Credits", "Ansh" };
		Assignment_62 assignment = new Assignment_62();
		String[] RevArray = assignment.ReveseArray(input);
		System.out.println(Arrays.toString(RevArray));
	}

	String Reverse(String input) {
		String word = " ";
		for (int i = input.length() - 1; i >= 0; i--) {
			word += input.charAt(i);
		}
		return word;
	}

	String[] ReveseArray(String[] input) {
		String[] arr = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			arr[j] = Reverse(input[i]);
		}
		return arr;
	}

}
