package harish.arraysdemo;

import java.util.Arrays;

/**
 * Assignment - 50 : 16th Dec'2024
 * 
 * Return the minimum number from given array.
 * 
 * input : {44,45,22,25,47,29,46} output : 22
 * 
 * 
 * input : {-44,-45,-22,-25,-47,29,46} output : -47
 */

public class Assignment50 {

	int getMinNumber(int[] input) {
		int minNum = input[0];

		// Loop to iterate through the array elements
		for (int i = 1; i < input.length; i++) {

			// if element at particular index is less than current value of minNum,
			// reassign the value of minNum with it
			if (input[i] < minNum) {
				minNum = input[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		Assignment50 assignment50 = new Assignment50();
		int[] input1 = { 44, 45, 22, 25, 47, 29, 46 };
		System.out.println("In the given array " + Arrays.toString(input1) + " Min Number is = "
				+ assignment50.getMinNumber(input1));

		int[] input2 = { -44, -45, -22, -25, -47, 29, 46 };
		System.out.println("In the given array " + Arrays.toString(input2) + " Min Number is = "
				+ assignment50.getMinNumber(input2));
	}
}