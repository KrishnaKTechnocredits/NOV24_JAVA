/*
 * Assignment - 80 : 11th Jan
Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8].

 */

package rohan;

import java.util.*;

public class Assignment_80 {

	public static void main(String[] args) {
		Assignment_80 assignment = new Assignment_80();
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99, 99 };
		assignment.getIndexOfDuplicate(input);
	}

	List<Integer> getOriginalLength(int[] arr) {
		List<Integer> getInputArray = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			getInputArray.add(arr[i]);
		}
		return getInputArray;
	}

	List<Integer> getDuplicateArray(int[] arr) {
		List<Integer> getDuplicateArrayList = getOriginalLength(arr);
		List<Integer> Duplicate = new ArrayList<>();
		for (int i = 0; i < getDuplicateArrayList.size(); i++) {
			int A = getDuplicateArrayList.get(i);
			if (getDuplicateArrayList.indexOf(A) != getDuplicateArrayList.lastIndexOf(A)
					&& i == getDuplicateArrayList.indexOf(A)) {
				Duplicate.add(arr[i]);
			}
		}
		// System.out.println(Duplicate);
		return Duplicate;
	}

	List<Integer> getIndexOfDuplicate(int[] arr) {
		List<Integer> AllIndex = new ArrayList<>();
		List<Integer> TempArray = getOriginalLength(arr);
		List<Integer> IndexOfDuplicate = getDuplicateArray(arr);
		for (int j = 0; j < IndexOfDuplicate.size(); j++) {
			int A = IndexOfDuplicate.get(j);
			for (int i = 0; i < TempArray.size(); i++) {
				if (A == TempArray.get(i)) {
					AllIndex.add(i);
				}
			}
			System.out.println(A + " is duplicate, at index " + AllIndex);
			AllIndex.clear();
		}
		return IndexOfDuplicate;
	}

}
