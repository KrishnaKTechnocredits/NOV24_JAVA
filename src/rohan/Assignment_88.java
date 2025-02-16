/*
 * Assignment - 88 : 16th Jan
From given array, return all duplicate elements.

int[] arr = {33,22,44,33,12,15,16,22};
output : [33,22]
 */

package rohan;

import java.util.*;

public class Assignment_88 {

	public static void main(String[] args) {
		int[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		Set<Integer> arrayOfNum = new HashSet<Integer>();
		Set<Integer> duplicate = new HashSet<Integer>();
		for (int num : arr) {
			if (arrayOfNum.add(num) != true) {
				duplicate.add(num);
			}
		}
		System.out.println(duplicate);
	}

}
