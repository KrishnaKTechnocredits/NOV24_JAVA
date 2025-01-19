package vrushali.arrayProgram;

import java.util.Arrays;
//Challenge 1:Replace each element in the array with the sum of all other elelments in Array

public class Challenge_1_Test {

	int getSumOfArrayElements(int[] numArray, int index) {
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			if (i == index) {
				// do nothing
			} else {
				sum = sum + numArray[i];
			}
		}
		return sum;
	}

	int[] replaceNumWithSumOfOtherNum(int[] numArray) {
		int[] outputArray = new int[numArray.length];
		int sum = 0;
		for (int i = 0; i < numArray.length; i++) {
			sum = 0;
			sum = getSumOfArrayElements(numArray, i);
			outputArray[i] = sum;
		}
		return outputArray;
	}

	public static void main(String[] args) {
		Challenge_1_Test challenge_1_Test = new Challenge_1_Test();
		int[] numArray = { 3, 5, 7, 1, 9 };
		int outputArray[] = challenge_1_Test.replaceNumWithSumOfOtherNum(numArray);
		System.out.println("Original Array --> " + Arrays.toString(numArray));
		System.out.println("Output Array -->" + Arrays.toString(outputArray));
	}

}
