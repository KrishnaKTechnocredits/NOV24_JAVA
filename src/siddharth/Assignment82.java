package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 82 : 12th Jan
Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11]
 */
public class Assignment82 {

	List<Integer> getListOfDup(Integer[] input){
		List<Integer> listOfNumbers = Arrays.asList(input);
		List<Integer> duplicateNumbers = new ArrayList<Integer>();
		for(int i=0;i<listOfNumbers.size();i++) {
			int currentNumber=listOfNumbers.get(i);
			if(listOfNumbers.indexOf(currentNumber)!=listOfNumbers.lastIndexOf(currentNumber) && i==(listOfNumbers.indexOf(currentNumber))){
				duplicateNumbers.add(currentNumber);
			}
		}
		return duplicateNumbers;
	}
	
	public static void main(String[] args) {
		Integer[] arr = {10,44,55,22,44,11,77,88,99,11};
		Assignment82 assignment82 = new Assignment82();
		System.out.println("Output : "+assignment82.getListOfDup(arr));
	}
}
