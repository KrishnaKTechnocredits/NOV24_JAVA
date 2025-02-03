package vrushali;

import java.util.Arrays;

//Assignment - 72 : 6th Jan'2024
//
//Shift all the zeros at the end of an array.
//
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {5,22,44,55,12,19,0,0,0,0}

public class ShiftZeroAtTheEndOfArray72 {

	void shiftAllZeroAtTheEndOfArray(int[] numArray) {
		int[] outputArray = new int[numArray.length];
		int outputIndex = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != 0) {
				outputArray[outputIndex] = numArray[i];
				outputIndex++;
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

	public static void main(String[] args) {
		ShiftZeroAtTheEndOfArray72 shiftZeroAtTheEndOfArray72 = new ShiftZeroAtTheEndOfArray72();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		shiftZeroAtTheEndOfArray72.shiftAllZeroAtTheEndOfArray(arr);
	}
}
