//Assignment - 79 : 11th Jan
//Find out all the duplicate elements from given arrayList.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99]'
//output : 10 is duplicate, at index 0 and 3 
//         99 is duplicate , at index 1 and 7.

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment79 {

	void removeDuplicate(ArrayList<Integer> input) {
		ArrayList<Integer> duplicateArray = new ArrayList<>();
		for (int i = 0; i < input.size(); i++) {
			int currentNumber = input.get(i);
			while (input.indexOf(currentNumber) != i && !duplicateArray.contains(currentNumber)) {
				duplicateArray.add(currentNumber);
			}
		}

		System.out.println("duplicates Number :" + duplicateArray);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Assignment79 a79 = new Assignment79();
		Integer[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(input));
		a79.removeDuplicate(al);
	}
}
