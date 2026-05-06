/*
 * Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]
         
		 
Hint : hs.add() ---> returns false , it means that element is duplicate.
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assign_88_ReturnAllDuplicateElementsUsingHashSet {

	static List<Integer> returnDuplicateElements(List<Integer> list) {

		Set<Integer> hsSet = new HashSet<Integer>();
		List<Integer> duplicateElements = new ArrayList<Integer>();
		// Using Enhance for loop
		for (int num : list) {
			if (!hsSet.add(num)) // If set (hs) fails to add num into set
				duplicateElements.add(num); // add that num to duplicateElements list
		}
		return duplicateElements;
	}

	public static void main(String[] args) {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		System.out.println("Input elements --> " + Arrays.toString(arr));

		List<Integer> list = Arrays.asList(arr);
		List<Integer> li = new ArrayList<Integer>(list);

		List<Integer> op = Assign_88_ReturnAllDuplicateElementsUsingHashSet.returnDuplicateElements(li);
		System.out.println("Duplicate Elements list --> " + op);
	}
}
