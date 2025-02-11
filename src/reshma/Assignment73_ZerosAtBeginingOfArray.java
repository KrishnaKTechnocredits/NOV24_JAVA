package reshma;

import java.util.Arrays;

/* Shift all the zeros at the begining of an array.
int[] arr = {5,0,22,44,0,0,55,0,12,19};
output : {0,0,0,0,5,22,44,55,12,19} */

public class Assignment73_ZerosAtBeginingOfArray {
	int[] getArray(int[] arr) {
		int[] output = new int[arr.length];
		int count = arr.length-1;
		for (int i =arr.length-1; i >=0 ; i--) {
			if (arr[i] != 0) {
				output[count] = arr[i];
				count--;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment73_ZerosAtBeginingOfArray a73 = new Assignment73_ZerosAtBeginingOfArray();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		int[] ans = a73.getArray(arr);
		System.out.println("The zeros at the begining of an array " +Arrays.toString(ans));
		}
}
