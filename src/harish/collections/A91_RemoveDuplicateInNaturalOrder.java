package harish.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

/**
 * Assignment - 91 : 16th jan
 * 
 * Remove all duplicates and return the set having all number in natural order.
 * 
 * Integer[] arr = {66,33,44,12,99,22,33,33,66};
 * 
 * Output : [12,22,33,44,66,99]
 */

public class A91_RemoveDuplicateInNaturalOrder {

	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		System.out.println("Input: " + Arrays.asList(arr));
		// use a tree set to add elements in natural order
		Set<Integer> uniqueNumbers = new TreeSet<Integer>();
		for (Integer num : arr) {
			uniqueNumbers.add(num);
		}

		System.out.println("Unique numbers sorted in natural order: " + uniqueNumbers);
	}
}