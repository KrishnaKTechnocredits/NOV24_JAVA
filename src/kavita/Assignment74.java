package kavita;

import java.util.Arrays;

public class Assignment74 {
	int[] getRotatArrateToRight(int[] input) {
		int[] output = new int[input.length];
		output[0] = input[input.length - 1];
		for (int i = 0, j = 1; i < input.length - 1; i++, j++) {
			output[j] = input[i];
		}
		System.out.println("Rotated array is: " + Arrays.toString(output));
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 10, 20, 30, 40, 50 };
		Assignment74 assignment74 = new Assignment74();
		System.out.println("Input array is: " + Arrays.toString(input));
		assignment74.getRotatArrateToRight(input);

	}
}
