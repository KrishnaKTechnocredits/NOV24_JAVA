package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_56 {

	int[] getMaxNumOfEachIndex(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length];
		for (int i = 0, j = 0, k = 0; i < arr1.length; i++, j++, k++) {
			if (arr1[i] > arr2[j]) {
				output[k] = arr1[i];
			} else if (arr1[i] < arr2[j]) {
				output[k] = arr2[j];
			}
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_56 assignment_56 = new Assignment_56();
		int[] arr1 = { 20, 10, 50, 78, 24 };
		int[] arr2 = { 10, 30, 20, 90, 21 };
		System.out.println(Arrays.toString(assignment_56.getMaxNumOfEachIndex(arr1, arr2)));
	}
}
