/*
 *2nd Jan'2025
 

Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};

*/

package rohan;

import java.util.Arrays;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question1 ques = new Question1();
		int[] input = { 3, 5, 7, -1, 9 };
		int[] Output = ques.SumArray(input);
		System.out.println(Arrays.toString(Output));
	}

	int[] SumArray(int[] input) {

		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				if (input[i] != input[j]) {
					sum += input[j];
				}
			}
			output[i] = sum;
		}
		return output;
	}

}
