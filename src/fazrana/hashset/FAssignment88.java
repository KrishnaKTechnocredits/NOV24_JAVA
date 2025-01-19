//Assignment - 88 : 16th Jan
//From given array, return all duplicate elements.
//
//int[] arr = {33,22,44,33,12,15,16,22};
//output : [33,22]
//         
//		 
//Hint : hs.add() ---> returns false , it means that element is duplicate.

package fazrana.hashset;

import java.util.*;

public class FAssignment88 {
	Set<Integer> getDuplicateArray(Integer[] array){
		Set<Integer> set= new HashSet<Integer>();
		Set<Integer> set1= new HashSet<Integer>();
		
		for(int i: array) {
			boolean value=set.add(i);
			if (!value) {
				set1.add(i);
			}
		}
		return set1;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {33,22,44,33,12,15,16,22,44};
		System.out.println("Input:" +Arrays.toString(arr));
		FAssignment88 fassignment88=new FAssignment88();
		System.out.println("Duplicate object array: "+fassignment88.getDuplicateArray(arr));
	}
}
