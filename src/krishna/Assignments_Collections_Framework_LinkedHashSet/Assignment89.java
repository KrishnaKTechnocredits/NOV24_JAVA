package Assignments_Collections_Framework_LinkedHashSet;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Assignment89 {
	
	Set<Integer> getSetOfUniqueNumbers(Integer[] arr){
		Set<Integer> setOfUniqueNumbers = new LinkedHashSet<Integer>(Arrays.asList(arr));
		return setOfUniqueNumbers;
	}

	public static void main(String[] args) {
		Assignment89 assignment89 = new Assignment89();
		Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
		System.out.println(assignment89.getSetOfUniqueNumbers(arr));
	}
}
