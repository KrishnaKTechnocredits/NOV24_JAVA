package reshma;

import java.util.Arrays;
/* Shift all the zeros at the end of an array.
int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {5,22,44,55,12,19,0,0,0,0} */

public class Assignment72_ZerosAtEndOfArray {
	int[] getArray(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				output[count] = arr[i];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment72_ZerosAtEndOfArray a72 = new Assignment72_ZerosAtEndOfArray();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		int[] ans = a72.getArray(arr);
		System.out.println("The zeros at the end of an array " +Arrays.toString(ans));
		}
}
