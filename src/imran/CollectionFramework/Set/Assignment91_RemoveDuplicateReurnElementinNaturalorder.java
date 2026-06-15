/*
Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] 	
*/

package imran.CollectionFramework.Set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91_RemoveDuplicateReurnElementinNaturalorder {

	Set<Integer> getUniquenaturalorderElement(Integer[] data)
	{
		Set<Integer> hs = new TreeSet<Integer>(Arrays.asList(data));
		return hs;
	}
	
	public static void main(String[] args) {
		
		Assignment91_RemoveDuplicateReurnElementinNaturalorder assignment91_1 = new Assignment91_RemoveDuplicateReurnElementinNaturalorder();
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println("The Given Array is : " + Arrays.toString(arr));
		Set<Integer> result = assignment91_1.getUniquenaturalorderElement(arr);
		System.out.println("The List with unique element in natural order is " + result);
	}
}
