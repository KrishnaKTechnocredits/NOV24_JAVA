/*
 * Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}

output : [10,102,28,77,88]

NOTE : Use sop(Arrays.toString(output)) to print the array without for loop
 */

package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_56_ReturnArrayHavingMaxNumber {

	static int[] returnArrayHavingMaxNum(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		int count = 0;
		for (int index = 0, innerIndex = 0; index < arr1.length; index++, innerIndex++) {
			if (arr1[index] > arr2[innerIndex]) {
				output[count] = arr1[index];
				count++;
			} else {
				output[count] = arr2[innerIndex];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 55, 22, 77, 88 };
		int[] arr2 = { 5, 102, 28, 77, 18 };
		int[] op = returnArrayHavingMaxNum(arr1, arr2);
		System.out.println("Array having maximum number from each index of given two array.");
		System.out.println(Arrays.toString(op));
	}
}
