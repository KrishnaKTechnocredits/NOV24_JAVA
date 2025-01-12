package harish.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment - 79 : 11th Jan
 * 
 * Find out all the duplicate elements from given arrayList.
 * 
 * Input : [10, 99, 10, 10, 77, 55, 46, 99]
 * 
 * Output : 10 is duplicate, at index 0 and 3 99 is duplicate , at index 1 and
 * 7.
 */

public class FindAllDuplicateElements {

	private void printDuplicateElements(List<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			int indexOfNum = input.indexOf(num);
			int lastIndexOfNum = input.lastIndexOf(num);
			// checking if indexOfNum and lastIndexOfNum are not equals which means number
			// is duplicate and i == indexOfNum ensures that for duplicate number, we print
			// the statement only once
			if (indexOfNum != lastIndexOfNum && i == indexOfNum) {
				System.out.println(num + " is dupliacte. It's first index is " + indexOfNum + " and last index is "
						+ lastIndexOfNum);
			}
		}
	}

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(99);
		input.add(10);
		input.add(10);
		input.add(77);
		input.add(55);
		input.add(46);
		input.add(99);
		System.out.println("Input : " + input);

		FindAllDuplicateElements f = new FindAllDuplicateElements();
		System.out.println("Output : ");
		f.printDuplicateElements(input);
	}
}