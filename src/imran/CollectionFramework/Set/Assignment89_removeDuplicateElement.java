/*
Assignment - 89 : 16th jan
Remove all the duplicates from given array. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
*/
package imran.CollectionFramework.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment89_removeDuplicateElement {

	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println("The given Array is :" + Arrays.toString(arr));
		Set<Integer> hs = new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println("The List after removal of Duplicate element are as followes : "+ hs );
	}
}
