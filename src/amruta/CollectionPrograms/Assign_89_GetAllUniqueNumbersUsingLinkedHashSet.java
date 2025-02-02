/*
 * /*
 Assignment - 89 : 16th jan
Remove all the duplicates from given array. 
Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class Assign_89_GetAllUniqueNumbersUsingLinkedHashSet {

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(arr));
		System.out.println("Given List : " + list);
		
		HashSet<Integer> hs = new LinkedHashSet<Integer>(list); //Passing list into LinkedHashSet's Constructor
		System.out.println("Set of Unique Numbers: " + hs);
	}
}