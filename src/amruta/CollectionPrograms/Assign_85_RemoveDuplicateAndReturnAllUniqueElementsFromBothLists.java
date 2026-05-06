/*
 * Assignment - 85: 14th Jan

Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]		
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Assign_85_RemoveDuplicateAndReturnAllUniqueElementsFromBothLists {

	// Using removeAll() and addAll() method
	void removeAllDuplicateElementsFromBothLists(List<Integer> list1, List<Integer> list2) {
		list2.removeAll(list1);
		//System.out.println("List 2 : " + list2);
		list2.addAll(list1);
		System.out.println("\nAll the unique elements from both list -- " + list2);
	}

	// Using Set - LinkedHashSet
	List<Integer> getUniqueNumbers(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set1 = new LinkedHashSet<Integer>(list1); // Passing ArrayList to Set constructor
		Set<Integer> set2 = new LinkedHashSet<Integer>(list2);
		set1.addAll(set2);
		List<Integer> outputList = new ArrayList<Integer>(set1); // Passing set to ArrayList constructor
		return outputList;
	}

	public static void main(String[] args) {

		Integer[] arr1 = { 10, 20, 30, 40 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		System.out.println("List 1 : " + list1);

		Integer[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
		System.out.println("List 2 : " + list2);

		Assign_85_RemoveDuplicateAndReturnAllUniqueElementsFromBothLists a85 = new Assign_85_RemoveDuplicateAndReturnAllUniqueElementsFromBothLists();

		a85.removeAllDuplicateElementsFromBothLists(list1, list2);
		
		List<Integer> li = a85.getUniqueNumbers(list1, list2);

		System.out.println("\nAll the unique elements from both list : " + li);

		
	}
}
