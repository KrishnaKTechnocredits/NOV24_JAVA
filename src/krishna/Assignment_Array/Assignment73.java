package Assignment_Array;

import java.util.Arrays;

public class Assignment73 {
	int[] getNewOrderArray(int[] arr) {
		int[] newOrderArray = new int[arr.length];
		int nonZeroValueCount = arr.length-1;
		for (int i = arr.length-1; i>=0; i--) {
			if (arr[i] != 0) {
				newOrderArray[nonZeroValueCount] = arr[i];
				nonZeroValueCount--;
			}

		}
		return newOrderArray;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		System.out.println(Arrays.toString(new Assignment73().getNewOrderArray(arr)));
	}
}
