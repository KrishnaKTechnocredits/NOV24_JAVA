package siddharth;

import java.util.Arrays;
import java.util.HashSet;

/*
Assignment - 89 : 16th jan
Remove all the duplicates from given array. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
 */
public class Assignment89 {
	
	HashSet<Integer> getDupElements(Integer[] input){
		HashSet<Integer> duplicateElements = new HashSet<Integer>(Arrays.asList(input));
			return duplicateElements;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		Assignment89 assignment89 = new Assignment89();
		System.out.println("Output : "+assignment89.getDupElements(arr));
	}
}
