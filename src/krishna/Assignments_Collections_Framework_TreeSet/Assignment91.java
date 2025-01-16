package Assignments_Collections_Framework_TreeSet;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Assignment91 {
	
	Set<Integer> getSetInNaturalOrder(Integer[] arr){
		Set<Integer> setOfUniqueNumbers = new TreeSet<Integer>(Arrays.asList(arr));
		return setOfUniqueNumbers;
	}

	public static void main(String[] args) {
		Assignment91 assignment91 = new Assignment91();
		Integer[] arr = {66,33,44,12,99,22,33,33,66};
		System.out.println(assignment91.getSetInNaturalOrder(arr));
	}
}
