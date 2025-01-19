package siddharth;

import java.util.HashSet;

/*
Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]

Hint : hs.add() ---> returns false , it means that element is duplicate.
 */
public class Assignment88 {
	
	HashSet<Integer> getDupElements(Integer[] input){
		HashSet<Integer> uniqueElements = new HashSet<Integer>();
		HashSet<Integer> duplicateElements = new HashSet<Integer>();
			for(int num : input) {
				if(!uniqueElements.add(num)) {
					duplicateElements.add(num);
				}
			}
			return duplicateElements;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {33,22,44,33,12,15,16,22};
		Assignment88 assignment88 = new Assignment88();
		System.out.println("Output : "+assignment88.getDupElements(arr));
	}
}
