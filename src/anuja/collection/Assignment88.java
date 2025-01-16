package anuja.collection;
/*From given array, return all duplicate elements usingset.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]*/

import java.util.*;
public class Assignment88 {

	public static void main(String[] args) {
		Assignment88 assignment88 = new Assignment88();
		//input is array
		int[] inputArr= {33,22,44,33,12,15,16,22};
		System.out.println("Input arrya is: \n " +Arrays.toString(inputArr));

		//get output in set
		Set<Integer> outputSet = new HashSet<Integer>();
		outputSet = assignment88.findDuplicateUsingSet(inputArr);
		System.out.println("Output set is: \n " +outputSet);
		
	}
	
	private  Set<Integer> findDuplicateUsingSet(int[] arr){
		Set<Integer> outputSet = new HashSet<Integer>();
		Set<Integer> duplicateSet = new HashSet<Integer>();
		for(int  i = 0 ; i<arr.length ; i++) {
			if(!outputSet.add(arr[i])) {
				duplicateSet.add(arr[i]);
			}
		}
		return duplicateSet;
	}
}
