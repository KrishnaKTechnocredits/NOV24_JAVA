package harish.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * Assignment - 80 : 11th Jan
 * 
 * Find out all the duplicate elements from given arrayList and print them with
 * their index.
 * 
 * Input : [10, 99, 10, 10, 77, 55, 46, 99,99]
 * 
 * Output : 10 is duplicate, at index [0, 2,3] 99 is duplicate , at index
 * [1,7,8].
 */

public class FindAllDuplicateElementsWithAllIndex {

	// method to find all the index of given number in given ArrayList
	List<Integer> getArrayListOfIndex(ArrayList<Integer> al, int num) {
		ArrayList<Integer> allIndex = new ArrayList<Integer>();
		for (int index = 0; index < al.size(); index++) {
			if (al.get(index) == num) {
				allIndex.add(index);
			}
		}
		return allIndex;
	}

	private void printDuplicateElementsWithAllIndex(ArrayList<Integer> input) {
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			int indexOfNum = input.indexOf(num);
			int lastIndexOfNum = input.lastIndexOf(num);
			// checking if indexOfNum and lastIndexOfNum are not equals which means number
			// is duplicate and i == indexOfNum ensures that for duplicate number, we print
			// the statement only once
			if (indexOfNum != lastIndexOfNum && i == indexOfNum) {
				System.out.println(num + " is dupliacte, at index " + getArrayListOfIndex(input, num));
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(99);
		input.add(10);
		input.add(10);
		input.add(77);
		input.add(55);
		input.add(46);
		input.add(99);
		input.add(99);
		System.out.println("Input : " + input);

		FindAllDuplicateElementsWithAllIndex f = new FindAllDuplicateElementsWithAllIndex();
		System.out.println("Output : ");
		f.printDuplicateElementsWithAllIndex(input);
	}
}