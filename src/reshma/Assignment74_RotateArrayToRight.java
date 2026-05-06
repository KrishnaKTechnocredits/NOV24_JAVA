package reshma;

import java.util.Arrays;

/* Rotate all the numbers of an array to the right by one position. 
  input : {10,20,30,40,50}
  output : {50,10,20,30,40}; */

public class Assignment74_RotateArrayToRight {
	int[] getArray(int[] input) {
		int[] output = new int[input.length];
		output[0] = input[input.length - 1];
		for (int i = 1; i < input.length; i++) {
			output[i] = input[i - 1];
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment74_RotateArrayToRight a74 = new Assignment74_RotateArrayToRight();
		int[] input = { 10, 20, 30, 40, 50 };
		int[] ans = a74.getArray(input);
		System.out.println("Rotate array to the right " + Arrays.toString(ans));
	}
}
