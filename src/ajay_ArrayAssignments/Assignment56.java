package ajay_ArrayAssignments;

import java.util.Arrays;

public class Assignment56 {

	static int[] returnArraywithMaxNumber(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] > arr2[i]) {
				output[i] = arr1[i];
			} else {
				output[i] = arr2[i];
			}
		}
		return output;

	}
	public static void main(String[] args) {
		int[] arr1 = { 10, 55, 22, 77, 88 };
		int[] arr2 = { 5, 102, 28, 77, 18 };
		Assignment56.returnArraywithMaxNumber(arr1, arr2);
		int[] maxArray = returnArraywithMaxNumber(arr1, arr2);
		for (int i = 0; i < maxArray.length; i++) {
			
		}System.out.println("Max Array is :" + Arrays.toString(maxArray));

	}

}
