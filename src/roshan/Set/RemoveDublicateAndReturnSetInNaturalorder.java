package roshan.Set;

import java.util.*;

public class RemoveDublicateAndReturnSetInNaturalorder {
	Set<Integer> getNaturalOrder(Integer[] arr) {
		Set<Integer> orignaLList = new TreeSet<>(Arrays.asList(arr));
		return orignaLList;
	}

	public static void main(String[] args) {
		Integer[] arr = { 66, 33, 44, 12, 99, 22, 33, 33, 66 };
		RemoveDublicateAndReturnSetInNaturalorder removedublicateandreturnsetinnaturalorder = new RemoveDublicateAndReturnSetInNaturalorder();
		Set<Integer> output = removedublicateandreturnsetinnaturalorder.getNaturalOrder(arr);
		System.out.println(output);

	}
}

/*
 * Assignment - 91 : 16th jan Remove all duplicates and return the set having
 * all number in natural order.
 * 
 * Integer[] arr = {66,33,44,12,99,22,33,33,66}; output : [12,22,33,44,66,99]
 */