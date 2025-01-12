/*
 * Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.

Example:
Input: int[] input = {3, 5, 7, 1, 9};
Output: int[] output = {22, 20, 18, 24, 16};
 */

package amruta.ProgramTest1;

import java.util.Arrays;

public class Program1 {

	int resturnSum(int[] arr, int num) {
		int sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == num)
				continue;
			else
				sum += arr[index];
		}
		return sum;
	}

	void takeArray(int[] arr) {
		int[] op = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			op[index] = resturnSum(arr, arr[index]);
		}
		System.out.println("Output Array - " + Arrays.toString(op));
	}

	public static void main(String[] args) {
		int[] input = { 3, 5, 7, 1, 9 };
		System.out.println("Givan Array - " + Arrays.toString(input));
		new Program1().takeArray(input);
	}
}
