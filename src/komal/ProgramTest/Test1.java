//2nd Jan'2025
//
//Challenge - 1: replace each element in the array with the sum of all other elements in the array. The resulting array should be stored in a new array output.
//
//Example:
//Input: int[] input = {3, 5, 7, 1, 9};
//Output: int[] output = {22, 20, 18, 24, 16};

package komal.ProgramTest;

import java.util.Arrays;

public class Test1 {

	void getSumOfAllElements(int[] input) {
		int[] output = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			int sum = 0;
			for (int j = 0; j < input.length; j++) {
				if (i != j) {
					sum = sum + input[j];
					output[i] = sum;
				}
			}
		}
		System.out.print("Ouput Array :" + Arrays.toString(output));
	}

	public static void main(String[] args) {

		Test1 t1 = new Test1();
		int[] input = { 3, 5, 7, 1, 9 };
		t1.getSumOfAllElements(input);
	}

}
