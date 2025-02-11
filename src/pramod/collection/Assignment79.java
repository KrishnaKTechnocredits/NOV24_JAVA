/*
Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.
*/
package pramod.collection;

import java.util.*;

class Assignment79 {

	void printDuplicate(int[] input, int num) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			if (num == input[i]) {
				index.add(i);
			}
		}
		System.out.println(num +" is duplicate, at index " + index);
	}

	void printAllDuplicateElements(int[] input) throws ArrayIndexOutOfBoundsException {
		ArrayList<Integer> orignalList = new ArrayList<Integer>();
		for (int j = 0; j < input.length; j++) {
			orignalList.add(input[j]);
		}
		for (int i = 0; i < orignalList.size(); i++) {
			if (orignalList.indexOf(input[i]) != orignalList.lastIndexOf(input[i])
					&& orignalList.indexOf(input[i]) == i) {
				printDuplicate(input, input[i]);
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		try {
			new Assignment79().printAllDuplicateElements(input);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}