//Assignment - 79 : 11th Jan
//Find out all the duplicate elements from given arrayList.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99]'
//output : 10 is duplicate, at index 0 and 3 
//         99 is duplicate , at index 1 and 7.

package fazrana.arrayList;

import java.util.*;

public class FAssignment79 {

	boolean getDuplicateNum(int num, Integer[] array) {
		List<Integer> input = Arrays.asList(array);
		boolean value = false;
		if (input.indexOf(num) != input.lastIndexOf(num)) {
			value = true;
		}
		return value;
	}

	void getDuplicateNumArray(Integer[] array) {
		List<Integer> input = Arrays.asList(array);
		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			if (getDuplicateNum(num, array) && i == input.indexOf(num)) {
				System.out.println("output: "+num + " is duplicated, at index " + input.indexOf(num) + " and " + input.lastIndexOf(num));
			}
		}
	}

	public static void main(String[] args) {
		Integer[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		System.out.println("Input:" +Arrays.toString(input));
		FAssignment79 fassignment79 = new FAssignment79();
		fassignment79.getDuplicateNumArray(input);
	}
}
