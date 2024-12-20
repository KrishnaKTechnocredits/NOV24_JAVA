/*
Assignment - 56 : 18th Dec'2024 [15 mins] [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
*/
package pramod.arraydemo;

import java.util.*;

class Assignment56 {

	int[] getMaxArray(int[] input1, int[] input2) {
		int[] output = new int[input1.length];
		for (int i = 0, j = 0; i < input1.length; i++, j++) {
			if (input1[i] < input2[j]) {
				output[i] = input2[i];
			} else {
				output[i] = input1[i];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment56 A56 = new Assignment56();
		int[] input1 = { 10, 55, 22, 77, 88 };
		int[] input2 = { 5, 102, 28, 77, 18 };
		System.out.println("1st Array is: " + Arrays.toString(input1));
		System.out.println("2nd Array is: " + Arrays.toString(input2));
		int[] output = A56.getMaxArray(input1, input2);
		System.out.println("Maximum number aaray from two aaray is: " + Arrays.toString(output));
	}
}