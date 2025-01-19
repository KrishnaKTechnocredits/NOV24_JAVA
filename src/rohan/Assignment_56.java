/*
Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]
*/

package rohan;

import java.util.Arrays;

public class Assignment_56 {

	public static void main(String[] args) {
		Assignment_56 assignment = new Assignment_56();
		int[] input1 = { 10, 55, 22, 77, 88 };
		int[] input2 = { 5, 102, 28, 77, 18 };
		int[] output = assignment.MaxIndex(input1, input2);
		// Using for loop
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}

		/* By Calling inbuild methos
		System.out.println(Arrays.toString(output));
		*/
	}

	int[] MaxIndex(int[] input1, int[] input2) {
		int[] output = new int[input1.length];
		for (int i = 0; i < output.length; i++) {
			if (input1[i] >= input2[i]) {
				output[i] = input1[i];
			}
			if (input2[i] >= input1[i]) {
				output[i] = input2[i];
			}
		}
		return output;
	}

}
