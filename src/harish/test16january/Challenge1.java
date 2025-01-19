package harish.test16january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

/**
 * Challenge - 1 : 16th Jan'2025
 * 
 * Find out the 3rd largest number from given list.
 * 
 * Input : [55,44,55,12,99,99,36,24,8,23]
 * 
 * Output : 44
 */

public class Challenge1 {

	private static int getThirdLargestNumber(Integer[] input) {

		// convert the given Integer array to TreeSet to extract unique elements and at
		// the same time sort them in natural order
		TreeSet<Integer> uniqueNumbers = new TreeSet<Integer>(Arrays.asList(input));

		// converting back TreeSet to ArrayList as index based retrieval is needed
		ArrayList<Integer> outputList = new ArrayList<Integer>(uniqueNumbers);

		// returning third largest element
		return outputList.get(outputList.size() - 3);
	}

	public static void main(String[] args) {
		Integer[] input = { 55, 44, 55, 12, 99, 99, 36, 24, 8, 23 };
		System.out.println("Input : " + Arrays.asList(input));
		System.out.println("Third largest number in given list is : " + Challenge1.getThirdLargestNumber(input));
	}
}