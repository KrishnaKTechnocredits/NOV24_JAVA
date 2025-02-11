package ashwini.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]
         
		 
Hint : hs.add() ---> returns false , it means that element is duplicate.
 */
public class Assignment88 {
	List<Integer> getDuplicateNum(int[] inputArr ){
		//create a list to hold duplicate elements
		List<Integer> duplicateSet =new ArrayList<Integer>();
		Set<Integer> outputSet = new HashSet<Integer>();
		
		//iterate all numbers from given input array
		for(int i=0;i<inputArr.length;i++) {
			//try to add each element in the set using add method,as add method returns boolean true or false,
			//false means that element is duplicate
			if(!outputSet.add(inputArr[i])) {
				duplicateSet.add(inputArr[i]);
			}
		}
		return duplicateSet;
	}
	
		
public static void main(String[] args) {
	int[] inputArr= {33,22,44,33,12,15,16,22};
	System.out.println("Input array is: " +Arrays.toString(inputArr));

	Assignment88 a88=new Assignment88();
	List<Integer> outputset=a88.getDuplicateNum(inputArr);
	System.out.println("Duplicate Numbers are: "+outputset);
	
	
}

}