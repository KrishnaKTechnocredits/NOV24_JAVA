package pranita;

import java.util.Arrays;

public class Assignment74 {
	public int[] rotateArray(int[] arr, int times) {
		if (arr == null || arr.length == 0 || times < 0) {
			throw new IllegalArgumentException("Invalid input.");
		}

		int length = arr.length;
		times = times % length;

		int[] newArr = new int[length];

		for (int i = 0; i < length; i++) {
			newArr[(i + times) % length] = arr[i];
		}

		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		Assignment74 test = new Assignment74();
		int[] rotatedArr = test.rotateArray(arr, 1);
		System.out.println(Arrays.toString(rotatedArr));
	}
}
