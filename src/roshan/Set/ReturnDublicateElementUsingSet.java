package roshan.Set;

import java.util.*;

public class ReturnDublicateElementUsingSet {
	Set<Integer> getListofDublicateElement(Integer[] arr) {
		Set<Integer> orignalList = new HashSet<Integer>();// mistake made here dont convert list
															// array into list.
		Set<Integer> SecondList = new HashSet<Integer>();
		for (Integer number : arr) {
			if (!orignalList.add(number)) { // if any no not added again then will go in second list
				SecondList.add(number);
			}

		}
		return SecondList;

	}

	public static void main(String[] args) {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		ReturnDublicateElementUsingSet returndublicateelementusingset = new ReturnDublicateElementUsingSet();
		Set<Integer> Output = returndublicateelementusingset.getListofDublicateElement(arr);
		System.out.println(Output);
	}
}

/*
 * Assignment - 88 : 16th Jan From given array, return all duplicate elements
 * usingset.
 * 
 * int[] arr = {33,22,44,33,12,15,16,22}; output : [33,22]
 */
