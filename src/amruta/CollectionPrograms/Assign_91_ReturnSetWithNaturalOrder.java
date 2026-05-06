/*
 * Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] 
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Assign_91_ReturnSetWithNaturalOrder {

	static Set<Integer> returnElementsInnaturalOrder(List<Integer> li) {
		Set<Integer> hs = new TreeSet<Integer>(li);
		return hs;
	}

	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		System.out.println("Input Array --> " + Arrays.toString(arr));
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		Set<Integer> hs = Assign_91_ReturnSetWithNaturalOrder.returnElementsInnaturalOrder(list);
		System.out.println("Set in natural order --> " + hs);
	}
}
