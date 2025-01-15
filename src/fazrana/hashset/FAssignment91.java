//Assignment - 91 : 16th jan
//Remove all duplicates and return the set having all number in natural order. 
//
//Integer[] arr = {66,33,44,12,99,22,33,33,66};
//output : [12,22,33,44,66,99] 	

package fazrana.hashset;

import java.util.*;

public class FAssignment91 {
	Set<Integer> getInNaturalOrder(Integer[] array) {
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(array));
//		Set<Integer> set1 = new TreeSet<Integer>(Collections.reverseOrder());

		return set;
	}

	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		System.out.println("Input: " + Arrays.toString(arr));
		FAssignment91 fassignment91 = new FAssignment91();
		System.out.println("Output: " + fassignment91.getInNaturalOrder(arr));
	}

}
