package Assignments_Collections_Framework_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Assignment88 {
	
	Set<Integer> getSetOfDuplicateNumbers(int[] arr){
		Set<Integer> setOfNumbers = new HashSet<Integer>();
		Set<Integer> setOfDuplicateNumbers = new HashSet<Integer>();
		
		for(int num : arr) {
			if(setOfNumbers.add(num)== false) {
				setOfDuplicateNumbers.add(num);
			}
		}
		
		return setOfDuplicateNumbers;
	}

	public static void main(String[] args) {
		Assignment88 assignment88 = new Assignment88();
		int[] arr = {33,22,44,33,12,15,16,22};
		System.out.println(assignment88.getSetOfDuplicateNumbers(arr));
	}
}
