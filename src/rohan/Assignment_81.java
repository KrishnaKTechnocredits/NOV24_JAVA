/*
 * Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [10,55,22,77,88,99]
 */

package rohan;

import java.util.*;

public class Assignment_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_81 Assignment = new Assignment_81();
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment.getUniqueNum(arr);
	}

	List<Integer> getOriginalList(int[] arr) {
		List<Integer> OriginalList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			OriginalList.add(arr[i]);
		}
		return OriginalList;
	}

	List<Integer> getUniqueNum(int[] arr) {
		List<Integer> OriginalList = getOriginalList(arr);
		List<Integer> uniqueNum = new ArrayList<Integer>();
		for (int i = 0; i < OriginalList.size(); i++) {
			int A = OriginalList.get(i);
			if (OriginalList.indexOf(A) == OriginalList.lastIndexOf(A)) {
				uniqueNum.add(arr[i]);
			}
		}
		System.out.println(uniqueNum);
		return uniqueNum;
	}

}
