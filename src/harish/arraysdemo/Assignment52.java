package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 52 : 16th Dec'2024
 * 
 * Return maximum and minimum number from given array.
 */

public class Assignment52 {

	int[] getMinAndMaxNum(int[] input) {
		int[] output = new int[2];
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
		output[0] = minNum;
		output[1] = maxNum;

		return output;
	}

	public static void main(String[] args) {
		Assignment52 assignment52 = new Assignment52();
		int[] input = { -44, -45, -22, -25, -47, 29, 46 };
		int[] minAndMaxNum = assignment52.getMinAndMaxNum(input);
		System.out.println("In the given array " + Arrays.toString(input) + "\nMax Number is = " + minAndMaxNum[1]
				+ "\nMin Number is = " + minAndMaxNum[0]);
	}

}
