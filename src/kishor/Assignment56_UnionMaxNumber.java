package kishor;

import java.util.Arrays;

public class Assignment56_UnionMaxNumber {

	int[] getMaxNumberUnion(int[] arr1, int[] arr2) {
		int[] obj = new int[arr1.length];
		int count = 0;

		for (int i = 0, k = 0; i < arr1.length; i++, k++) {
			if (arr1[i] > arr2[k]) {
				obj[count] = arr1[i];
				count++;
			} else {
				obj[count] = arr2[k];
				count++;
			}
		}
		return obj;

	}

	public static void main(String[] args) {
		int[] arr1 = { 10, 55, 22, 77, 88 };
		int[] arr2 = { 5, 102, 28, 77, 18 };
		Assignment56_UnionMaxNumber assignment56 = new Assignment56_UnionMaxNumber();
		int[] ans = assignment56.getMaxNumberUnion(arr1, arr2);
		System.out.println(Arrays.toString(ans));
	}
}
