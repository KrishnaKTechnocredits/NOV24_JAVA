package roshan.Set;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateFromArray {
	Set<Integer> getListWithoutDublicateElement(Integer[] arr) {

		// Set<Integer> orignalList = new HashSet<Integer>(Arrays.asList(arr));order nt followed

		Set<Integer> orignalList = new LinkedHashSet<Integer>(Arrays.asList(arr));// to maintaion insertion order

		return orignalList;

	}

	public static void main(String[] args) {
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		RemoveDublicateFromArray removedublicatefromarray = new RemoveDublicateFromArray();
		Set<Integer> Output = removedublicatefromarray.getListWithoutDublicateElement(arr);
		System.out.println(Output);
	}
}

/*
 * Assignment - 89 : 16th jan Remove all the duplicates from given array.
 * 
 * Integer[] arr = {10,20,20,20,30,30,40,50,40,10};
 */
