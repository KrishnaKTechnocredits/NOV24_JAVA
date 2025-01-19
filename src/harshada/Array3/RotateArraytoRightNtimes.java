package harshada.Array3;

import java.util.Arrays;

public class RotateArraytoRightNtimes {
	//method to rotate array 1 time
	int[] rotateArray(int[] arr) {
		int[] arr2 = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (i < arr.length - 1) {
				arr2[i + 1] = arr[i];
			}
		}
		arr2[0] = arr[arr.length - 1];
		System.out.println(Arrays.toString(arr2));
		return arr2;
	}

	//to rotate array N times
	void rotateArrayNtimes(int[] arr, int num) {
		int[] output = new int[arr.length];
		output = rotateArray(arr);
		for (int i = 1; i < num; i++) {
			output = rotateArray(output);
		}		
	}
	
	public static void main(String[] args) {
		RotateArraytoRightNtimes ass74_2 = new RotateArraytoRightNtimes();
		int[] input = { 10, 20, 30, 40, 50 };
		ass74_2.rotateArrayNtimes(input, 5);
	}
}
