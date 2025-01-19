package prem;

import java.util.Arrays;

public class Assignment73 {

	void shiftZeroesAtLast(int[] arr) {
		int[] output = new int[arr.length];
		int j = output.length - 1;
		for (int i = arr.length - 1; i >= 0; i--) {
			int digit = arr[i];
			if (digit != 0) {
				output[j] = digit;
				j--;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment73 assign73 = new Assignment73();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		assign73.shiftZeroesAtLast(arr);
	}

}
