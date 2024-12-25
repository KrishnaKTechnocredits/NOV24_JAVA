package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 51 : 16th Dec'2024
 * 
 * Print maximum and minimum number from given array.
 */

public class Assignment51 {

	void printMinAndMaxNum(int[] input) {
		int minNum = input[0];
		int maxNum = input[0];
		// Loop to iterate through the array elements
		for (int i = 1; i < input.length; i++) {

			// if element at particular index is less than current value of minNum,
			// update minNum
			if (input[i] < minNum) {
				minNum = input[i];
			}

			// if element at particular index is greater than current value of maxNum,
			// update maxNum
			if (input[i] > maxNum) {
				maxNum = input[i];
			}
		}

		System.out.println("In the given array " + Arrays.toString(input) + "\nMax Number is = " + maxNum
				+ "\nMin Number is = " + minNum);
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		int[] input = { -44, -45, -22, -25, -47, 29, 46 };
		assignment51.printMinAndMaxNum(input);
	}
}