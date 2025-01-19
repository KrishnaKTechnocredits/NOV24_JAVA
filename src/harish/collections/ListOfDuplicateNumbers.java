package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignment - 82 : 12th Jan
 * 
 * Return the list of duplicate numbers from given Array. [IMP]
 * 
 * Input : int[] arr = {10,44,55,22,44,11,77,88,99,11};
 * 
 * Output : [44, 11]
 */

public class ListOfDuplicateNumbers {

	private List<Integer> getDuplicateNumbers(Integer[] input) {

		// insert all elements of original input array into a List (as we will be using
		// methods of List/ArrayList)
		List<Integer> originalNumbersList = Arrays.asList(input);
		// create a empty List where we will be inserting the duplicate numbers
		List<Integer> duplicateNumbers = new ArrayList<Integer>();
		// iterate the originalNumbersList
		for (int i = 0; i < originalNumbersList.size(); i++) {
			Integer number = originalNumbersList.get(i);
			// if indexOf and lastIndexOf number isn't same means element is duplicate
			if (originalNumbersList.indexOf(number) != originalNumbersList.lastIndexOf(number)
					&& !duplicateNumbers.contains(number)) {
				duplicateNumbers.add(number);
			}
		}
		return duplicateNumbers;
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		System.out.println("Input : " + Arrays.toString(input));
		ListOfDuplicateNumbers l = new ListOfDuplicateNumbers();
		List<Integer> duplicateNumbers = l.getDuplicateNumbers(input);
		System.out.println("Output : " + duplicateNumbers);
	}
}