/*Assignment - 56 : 20th Dec'2024 [15 mins]
Return the array having maximum number from each index of given two array.

input : 
{10,55,22,77,88}
{5,102,28,77,18}
output : [10,102,28,77,88]
NOTE : Use sop(Arrays.toString(output)) to print the array without for loop */
package pankaj;

import java.util.Arrays;

class Assignment56 {
	int[] maxArray(int[] arr, int[] arr1) {

		int[] output = new int[arr.length];
		int k = 0;
		for (int i = 0, j = 0; i <= arr.length - 1; i++, j++) {
			if (arr[i] >= arr1[j]) {
				output[k] = arr[i];
				k++;
			} else {
				output[k] = arr1[j];
				k++;
			}

		}
		System.out.println("The Maximum numbers from the 2 arrays");
		return output;

	}

	public static void main(String[] args) {
		Assignment56 A = new Assignment56();
		int[] arr2 = { 10, 55, 22, 77, 88 };
		int[] arr3 = { 5, 102, 28, 77, 18 };
		int[] num = A.maxArray(arr2, arr3);

		System.out.println("       " + Arrays.toString(num));

	}

}