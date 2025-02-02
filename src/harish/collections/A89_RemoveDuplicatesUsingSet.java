package harish.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Assignment - 89 : 16th jan
 * 
 * Remove all the duplicates from given array.
 * 
 * Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
 */

public class A89_RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		System.out.println("Input: " + Arrays.asList(arr));

		// using LinkedHashSet to preserve insertion order
		Set<Integer> uniqueElements = new LinkedHashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			uniqueElements.add(arr[i]);
		}
		System.out.println("Unique Elements: " + uniqueElements);
	}
}