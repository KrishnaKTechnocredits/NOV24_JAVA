package vrushali.arrayProgram;

import java.util.Arrays;

//Assignment - 56 : 20th Dec'2024 [15 mins]
//Return the array having maximum number from each index of given two array.
//
//input : 
//{10,55,22,77,88}
//{5,102,28,77,18}
//
//output : [10,102,28,77,88]
//
//NOTE : Use sop(Arrays.toString(output)) to print the array without for loop

public class ReturnMaxFromEachArray {
	int[] getMaxNumberFromEachIndexFrom2Array(int[] numArray1, int[] numArray2) {
		int[] finalArray = new int[numArray1.length];

		for (int i = 0; i < numArray1.length; i++) {
			if (numArray1[i] > numArray2[i]) {
				finalArray[i] = numArray1[i];
			} else {
				finalArray[i] = numArray2[i];
			}
		}
		return finalArray;
	}

	public static void main(String[] args) {
		ReturnMaxFromEachArray returnMaxFromEachArray = new ReturnMaxFromEachArray();
		int[] numArray1 = { 10, 55, 22, 77, 88 };
		int[] numArray2 = { 5, 102, 28, 77, 18 };
		int[] finalArray = returnMaxFromEachArray.getMaxNumberFromEachIndexFrom2Array(numArray1, numArray2);
		System.out.println("Max Number From Each Index From 2 Array" + Arrays.toString(finalArray));

	}
}
