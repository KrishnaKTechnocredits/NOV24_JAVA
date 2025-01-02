package vrushali.arrayProgram;

import java.util.Arrays;

//Assignment - 60 : 21st Dec'2024 [20 min]
//return second maximum number from given array.
//
//input = {33,33,19,55,53,11};
//output : 53 
public class ReturnSecondLargestNumberFromArray {
	int returnSecondLargestNumberFromArray(int[] numArray) {
		int maxNum = numArray[0], secondMaxNum = numArray[1];

		if (numArray[0] < numArray[1]) {
			maxNum = numArray[1];
			secondMaxNum = numArray[0];
		}

		for (int i = 2; i < numArray.length; i++) {
			if (numArray[i] > maxNum) {
				secondMaxNum = maxNum;
				maxNum = numArray[i];
			} else if (numArray[i] > secondMaxNum) {
				secondMaxNum = numArray[i];
			}
		}
		return secondMaxNum;
	}

	public static void main(String[] args) {
		ReturnSecondLargestNumberFromArray returnSecondLargestNumberFromArray = new ReturnSecondLargestNumberFromArray();
		int[] numArray = { 33, 12, 19, 55, 53, 11 };
		int secondLargestNum = returnSecondLargestNumberFromArray.returnSecondLargestNumberFromArray(numArray);
		System.out.println("Array:-- " + Arrays.toString(numArray));
		System.out.println("Second Largest number from array :-- " + secondLargestNum);

	}
}
