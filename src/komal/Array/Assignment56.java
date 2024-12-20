//@all 
//Assignment - 56 : 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//
//input : 
//{10,55,22,77,88}
//{5,102,28,77,18}
//
//output : [10,102,28,77,88]
//
//NOTE : Use sop(Arrays.toString(output)) to print the array without for loop

package komal.Array;

import java.util.Arrays;

public class Assignment56 {

	int[] getUnionArray(int[] input1, int[] input2) {

		int output[] = new int[input1.length];
		for (int i = 0; i < input1.length; i++) {
			if (input1[i] > input2[i]) {
				output[i] = input1[i];
			} else {
				output[i] = input2[i];
			}
		}
		return output;
	}

	public static void main(String args[]) {

		int[] first = { 10, 55, 22, 77, 88 };
		int[] second = { 5, 102, 28, 77, 18 };

		Assignment56 a56 = new Assignment56();
		int[] output = a56.getUnionArray(first, second);
//		for (int i = 0; i < output.length; i++) {
//			System.out.println(output[i]);
//		}
		System.out.println(Arrays.toString(output));
	}

}
