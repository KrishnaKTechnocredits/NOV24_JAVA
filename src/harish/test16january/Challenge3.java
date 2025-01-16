package harish.test16january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Challenge - 3
 * 
 * Find all the missing numbers between 1 to 10 from given List.
 * 
 * Input : [9,7,6,2,1,5,3,10]
 * 
 * Output : [4,8]
 */

public class Challenge3 {

	private static List<Integer> getAllMisingNumbers(Integer[] input, int startRange, int endRange) {

		// extract the given array of integers in ArrayList
		List<Integer> givenNumbersList = new ArrayList<Integer>(Arrays.asList(input));

		List<Integer> missingNumbers = new ArrayList<Integer>();

		// iterating from the given start and end range
		for (int i = startRange; i <= endRange; i++) {
			// check if the givenNumbersList contains element i
			if (!givenNumbersList.contains(i)) {
				missingNumbers.add(i);
			}
		}

		return missingNumbers;
	}

	public static void main(String[] args) {
		Integer[] input = { 9, 7, 6, 2, 1, 5, 3, 10 };
		int startRange = 1;
		int endRange = 10;
		System.out.println("Input : " + Arrays.asList(input));
		System.out.println(
				"Missing numbers in given list : " + Challenge3.getAllMisingNumbers(input, startRange, endRange));
	}
}