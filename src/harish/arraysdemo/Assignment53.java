package harish.arraysdemo;

/**
 * Assignment - 53 : 16th Dec'2024
 * 
 * Print the array in reverse order.
 * 
 * input : {10,34,22,16,19,99}
 * 
 * output : 99 19 16 22 34 10
 */

import java.util.Arrays;

public class Assignment53 {

	void printReverseArray(int[] input) {
		for (int i = input.length - 1; i >= 0; i--) {
			System.out.print(input[i] + " ");
		}
	}

	public static void main(String[] args) {
		Assignment53 assignment53 = new Assignment53();
		int[] input = { 10, 34, 22, 16, 19, 99 };
		System.out.println("Given Array is - " + Arrays.toString(input));
		System.out.println("Array in reverse order is - ");
		assignment53.printReverseArray(input);
	}
}