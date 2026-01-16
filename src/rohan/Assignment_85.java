/*
 * Remove duplicate from 2 list, and return all the unique elements from both list. 

input : [10, 20, 30, 40]
        [20,30,60,70,80,90,100,101,44,55,66,77]
output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
 */

package rohan;

import java.util.*;

public class Assignment_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_85 assignment = new Assignment_85();
		Integer[] arr1 = { 10, 20, 30, 40 };
		Integer[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		assignment.uniqueElement(arr1, arr2);
	}

	List<Integer> uniqueElement(Integer[] arr1, Integer[] arr2) {
		List<Integer> getArr1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> getArr2 = new ArrayList<Integer>(Arrays.asList(arr2));
		// System.out.println(getArr1);
		// System.out.println(getArr2);
		getArr2.removeAll(getArr1);
		getArr1.addAll(getArr2);
		System.out.println("Output= " + getArr1);
		return null;
	}

}
