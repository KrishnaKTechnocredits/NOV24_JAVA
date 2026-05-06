package roshan.String;

import java.util.Arrays;

public class RotateNoTwoTimeinArray {

	void getrotatedarray(int[] arr) {  // Method to rotate the array once to the left
		int temp = arr[0];            // Store the first element temporarily
		for (int i = 1; i < arr.length; i++) {  // Shift each element one position to the left
			arr[i - 1] = arr[i];       // Move current element to the previous index
		}
		arr[arr.length - 1] = temp;   // Place the first element at the end

	}
	// Method to rotate the array 'n' times to the left
	void noOfROtation(int[] arr, int n) {
		for (int count = 1; count <= n; count++) {
			getrotatedarray(arr);  // Call the rotation method 'n' times
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		RotateNoTwoTimeinArray rotatenotwotimeinarray = new RotateNoTwoTimeinArray();
		int n = 2;
		rotatenotwotimeinarray.noOfROtation(arr, n);
		System.out.println(Arrays.toString(arr));

	}
}