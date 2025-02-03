package vrushali;
//Assignment - 73 : 6th Jan'2024
//
//Shift all the zeros at the begining of an array.
//
//int[] arr = {5,0,22,44,0,0,55,0,12,19};
//output : {0,0,0,0,5,22,44,55,12,19}

import java.util.Arrays;


public class ShiftAllZeroAtTheBeginingOfArray73 {
	void shiftAllZeroAtTheBeginingOfArray(int[] numArray) {
		int[] outputArray = new int[numArray.length];
		int outputIndex = numArray.length-1;
		for (int i = 0; i < numArray.length; i++) {
			if (numArray[i] != 0) {
				outputArray[outputIndex] = numArray[i];
				outputIndex--;
			}
		}
		System.out.println(Arrays.toString(outputArray));
	}

	public static void main(String[] args) {
		ShiftAllZeroAtTheBeginingOfArray73 shiftAllZeroAtTheBeginingOfArray73 = new ShiftAllZeroAtTheBeginingOfArray73();
		int[] arr = { 5, 0, 22, 44, 0, 0, 55, 0, 12, 19 };
		shiftAllZeroAtTheBeginingOfArray73.shiftAllZeroAtTheBeginingOfArray(arr);
	}

}
