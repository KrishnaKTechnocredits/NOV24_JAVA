/*
 * Assignment - 89 : 16th jan
Remove all the duplicates from given array. 

Integer[] arr = {10,20,20,20,30,30,40,50,40,10};

 */

package rohan;

import java.util.*;

public class Assignment_89 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		Set<Integer> getUniqueNum = new HashSet<Integer>();
		for (int num : arr) {
			getUniqueNum.add(num);
		}
		System.out.println(getUniqueNum);
		/*
		Set<Integer> uniqueElement = new HashSet<Integer>(Arrays.asList(arr));
		System.out.println(getUniqueNum);
		*/
	}
}
