/*
Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22,33};
output : [33,22]
         
		 
Hint : hs.add() ---> returns false , it means that element is duplicate.

*/

package pramod.collection;
import java.util.*;
class Assignment88{

	Set<Integer> getDuplicateElements(int[] arr){
		Set<Integer> mySet = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();
		for(int num: arr){
			if(!mySet.contains(num)){
			mySet.add(num);
			}else
			{	
				if(!duplicateSet.contains(num))
				duplicateSet.add(num);
			}
		}
		return duplicateSet;
	}	

	public static void main(String[] args){
		int[] arr  = {33,22,44,33,12,15,16,22,33};
		System.out.println("Given array is: "+Arrays.toString(arr));
		Set<Integer> ans = new Assignment88().getDuplicateElements(arr);
		System.out.println("Duplicate elements are :" + ans);
	}	
}