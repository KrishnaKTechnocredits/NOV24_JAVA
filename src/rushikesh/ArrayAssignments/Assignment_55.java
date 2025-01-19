package rushikesh.ArrayAssignments;

import java.util.Arrays;

public class Assignment_55 {

	int[] getUnionOfArray(int[] arr1, int[] arr2) {
		int[] output = new int[arr1.length + arr2.length];
		int count = 0;
		for (int i = 0, j = 0; i < arr1.length + arr2.length; i++, j++) {
			if (i < arr1.length) {
				output[i] = arr1[j];
			} else if (count < arr2.length) {
				output[i] = arr2[count];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment_55 assignment_55 = new Assignment_55();
		int[] arr1 = { 10, 19, 18 };
		int[] arr2 = { 99, 8 };
		System.out.println(Arrays.toString(assignment_55.getUnionOfArray(arr1, arr2)));
	}
}
