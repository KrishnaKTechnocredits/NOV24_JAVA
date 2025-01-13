package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment82 {

	List<Integer> getDuplicateNumbersList(int[] arr) {
		List<Integer> listOfUniqueNumbers = new ArrayList<Integer>();
		List<Integer> listOfDuplicateNumbers = new ArrayList<Integer>();
		for (int num : arr) {
			if (!listOfUniqueNumbers.contains(num)) {
				listOfUniqueNumbers.add(num);
			}
			else if(!listOfDuplicateNumbers.contains(num)) {
				listOfDuplicateNumbers.add(num);
			}
		}
		return listOfDuplicateNumbers;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		System.out.println(new Assignment82().getDuplicateNumbersList(arr));
	}
}
