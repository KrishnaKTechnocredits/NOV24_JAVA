/*
 * Assignment - 82 : 12th Jan
Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11]
 */
package rohan;

import java.util.*;

public class Assignment_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_82 Assignment = new Assignment_82();
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment.getDuplicate(arr);
	}

	List<Integer> getOriginalList(int[] arr) {
		List<Integer> OriginalList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			OriginalList.add(arr[i]);
		}
		return OriginalList;
	}

	List<Integer> getDuplicate(int[] arr) {
		List<Integer> OriginalList = getOriginalList(arr);
		List<Integer> DuplicateList = new ArrayList<Integer>();
		for (int i = 0; i < OriginalList.size(); i++) {
			int A = OriginalList.get(i);
			if (OriginalList.indexOf(A) != OriginalList.lastIndexOf(A) && i == OriginalList.indexOf(A)) {
				DuplicateList.add(A);
			}
		}
		System.out.println(DuplicateList);
		return DuplicateList;
	}

}
