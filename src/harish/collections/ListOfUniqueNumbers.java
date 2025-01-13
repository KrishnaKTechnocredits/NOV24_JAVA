package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Assignment - 81 : 12th Jan
 * 
 * Return the unique list of numbers from given Array. [IMP]
 * 
 * Input : int[] arr = {10,44,55,22,44,11,77,88,99,11};
 * 
 * Output : [10,44,55,22,11,77,88,99]
 * 
 * Hint : contains method of ArrayList.
 */

public class ListOfUniqueNumbers {

	private List<Integer> getUniqueListOfNumbers(int[] input) {
		List<Integer> uniqueList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (!uniqueList.contains(input[i])) {
				uniqueList.add(input[i]);
			}
		}
		return uniqueList;
	}

	public static void main(String[] args) {
		int[] input = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		System.out.println("Input : " + Arrays.toString(input));
		ListOfUniqueNumbers l = new ListOfUniqueNumbers();
		List<Integer> uniqueListOfNumbers = l.getUniqueListOfNumbers(input);
		System.out.println("Output : " + uniqueListOfNumbers);
	}
}