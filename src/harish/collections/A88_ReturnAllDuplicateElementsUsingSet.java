package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Assignment - 88 : 16th Jan
 * 
 * From given array, return all duplicate elements.
 * 
 * Input : int[] arr = {33,22,44,33,12,15,16,22};
 * 
 * Output : [33,22]
 */

public class A88_ReturnAllDuplicateElementsUsingSet {

	private static List<Integer> getAllDuplicateElements(Integer[] input) {
		// create a list to hold duplicate elements
		List<Integer> duplicateNumbers = new ArrayList<Integer>();

		// create a set which holds unique elements from given input array
		Set<Integer> uniqueNumbers = new HashSet<Integer>();

		// iterate elements in array
		for (int i = 0; i < input.length; i++) {
			/**
			 * set.add() method adds element in set and return boolean true if element is
			 * added, false if unable to add element which means it's duplicated
			 */
			if (!uniqueNumbers.add(input[i])) {

				// if false, the add it to list of duplicate elements
				duplicateNumbers.add(input[i]);
			}
		}
		return duplicateNumbers;
	}

	public static void main(String[] args) {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		System.out.println("Input: " + Arrays.asList(arr));
		System.out.println("Duplicate Numbers: " + A88_ReturnAllDuplicateElementsUsingSet.getAllDuplicateElements(arr));
	}
}