//Assignment - 89 : 16th jan
//Remove all the duplicates from given array. 
//
//Integer[] arr = {10,20,20,20,30,30,40,50,40,10};

package fazrana.hashset;

import java.util.*;

public class FAssignment89 {
	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println("Input:"+ Arrays.toString(arr));
		Set<Integer> output= new LinkedHashSet<Integer>(Arrays.asList(arr));
		System.out.println("Output: "+output);
	}
}
