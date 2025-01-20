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

		}
		return DuplicateList;
	}

}
