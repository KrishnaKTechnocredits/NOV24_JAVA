package siddharth;

import java.util.Arrays;
import java.util.TreeSet;

/*
Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] 
 */
public class Assignment91 {
	
	TreeSet<Integer> getUniqueElementsInNatural(Integer[] input){
		TreeSet<Integer> elements = new TreeSet<Integer>(Arrays.asList(input));
			return elements;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		Assignment91 assignment91 = new Assignment91();
		System.out.println("Output : "+assignment91.getUniqueElementsInNatural(arr));
	}
}
