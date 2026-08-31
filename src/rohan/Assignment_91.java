/*
 * Assignment - 91 : 16th jan
Remove all duplicates and return the set having all number in natural order. 

Integer[] arr = {66,33,44,12,99,22,33,33,66};
output : [12,22,33,44,66,99] 	
 */

package rohan;

import java.util.*;

public class Assignment_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		Set<Integer> getNaturakNum = new TreeSet<Integer>(Arrays.asList(arr));
		System.out.println(getNaturakNum);
	}

}
