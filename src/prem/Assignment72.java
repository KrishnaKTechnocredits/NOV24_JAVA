package prem;

import java.util.Arrays;

public class Assignment72 {

	void shiftZeroesAtLast(int[] arr) {
		int[] output = new int[arr.length];
		for (int i = 0, j = 0; i < arr.length; i++) {
			int digit = arr[i];
			if (digit != 0) {
				output[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment72 assign72 = new Assignment72();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		assign72.shiftZeroesAtLast(arr);
	}
}
