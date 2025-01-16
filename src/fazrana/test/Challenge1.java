//Challenge - 1 : 16th Jan'2025
//Find out the 3rd largest number from given list.
//
//Input : [55,44,55,12,99,99,36,24,8,23]
//output : 44

package fazrana.test;

import java.util.Arrays;

public class Challenge1 {
	int getThirdLargestNumber(int[] array) {
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		int largestNumber = array[array.length - 1];
		int secLargestNumber = array[array.length - 2];
		int thirdLargestNumber = array[array.length - 3];
		int index = 0;

		for (int i = array.length - 1; i >= 2; i--) {
			if (array[i - 1] == largestNumber) {
				secLargestNumber = array[i - 2];
				thirdLargestNumber = array[i - 3];
				index = i - 2;
			} else {
				break;
			}
		}

		for (int i = index; i >= 1; i--) {
			if (array[i - 1] == secLargestNumber) {
				thirdLargestNumber = array[i - 2];
			} else {
				break;
			}
		}
		return thirdLargestNumber;
	}

	public static void main(String[] args) {
		int[] input = { 55, 44, 55, 12, 99, 99, 99, 36, 24, 8, 23, 55 };
		System.out.println("Input:"+ Arrays.toString(input));
		Challenge1 challenge1 = new Challenge1();
		System.out.println("Third largest number: " + challenge1.getThirdLargestNumber(input));
	}
}
