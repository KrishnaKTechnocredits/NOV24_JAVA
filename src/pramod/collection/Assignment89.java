/*
Assignment - 89 : 16th jan
Remove all the duplicates from given array. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
*/

package pramod.collection;
import java.util.*;
class Assignment89{

	void removeAllDuplicateElement(Integer[] arr){
		Set<Integer> hs = new HashSet<Integer>();
		for(int num : arr){
			hs.add(num);
		}
		System.out.println("Removed all duplicate from array: "+hs);
	}

	public static void main(String[] args){
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println("Given array is:"+ Arrays.toString(arr));
		new Assignment89().removeAllDuplicateElement(arr);
	}
}