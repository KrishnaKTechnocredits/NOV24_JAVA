/*
Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99]
*/


package pramod.collection;
import java.util.*;
class Assignment91{

	Set<Integer> getDuplicateRemovedInNaturalOrder(Integer[] arr){
		Set<Integer> mySet = new TreeSet<Integer>();
		for(Integer num : arr){
			mySet.add(num);
		}
		return mySet;
	}

	public static void main(String[] args){
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println("Given array is: "+ Arrays.toString(arr));
		Set<Integer> ans = new Assignment91().getDuplicateRemovedInNaturalOrder(arr);
		System.out.println("Numbers are in Natural order: "+ans);
		
	}
}