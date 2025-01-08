package rohan;

import java.util.Arrays;

public class Assignment_73 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_73 assignment = new Assignment_73();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		int[] output = assignment.ShiftZeroEStart(arr);
		System.out.println("outout : " + Arrays.toString(output));
	}

	int[] ShiftZeroEStart(int[] arr) {
		int[] output = new int[arr.length];
		int i = arr.length - 1;
		for (int j = arr.length - 1; j >= 0; j--) {
			if (arr[j] != 0) {
				output[i] = arr[j];
				i--;
			}
		}
		return output;
	}

}
