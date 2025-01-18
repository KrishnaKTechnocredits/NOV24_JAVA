package prem;

import java.util.Arrays;

public class Assignment74 {

	void rotateAllNumberByOnePosition(int[] arr) {
		int[] output = new int[arr.length];
		int temp = arr[arr.length - 1];
		for (int i = arr.length - 1; i >= 1; i--) {
			output[i] = arr[i - 1];
		}
		output[0] = temp;
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment74 assign74 = new Assignment74();
		int[] arr = { 10, 20, 30, 40, 50 };
		assign74.rotateAllNumberByOnePosition(arr);
	}

}
