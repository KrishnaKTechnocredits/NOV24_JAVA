package harish.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Assignment - 85: 14th Jan
 * 
 * Remove duplicate from 2 list, and return all the unique elements from both
 * list.
 * 
 * Input : [10, 20, 30, 40] [20,30,60,70,80,90,100,101,44,55,66,77]
 * 
 * Output : [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
 */

public class A85_RemoveDuplicatesFromList {

	private static List<Integer> getUniqueNumbers(List<Integer> l1, List<Integer> l2) {
		Set<Integer> set1 = new LinkedHashSet<Integer>(l1);
		Set<Integer> set2 = new LinkedHashSet<Integer>(l2);
		set1.addAll(set2);
		List<Integer> outputList = new ArrayList<Integer>(set1);
		return outputList;
	}

	public static void main(String[] args) {

		Integer[] i1 = { 10, 20, 30, 40 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(i1));
		System.out.println("Input List 1 : " + list1);

		Integer[] i2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(i2));
		System.out.println("Input List 2 : " + list2);

		List<Integer> uniqueNumbers = A85_RemoveDuplicatesFromList.getUniqueNumbers(list1, list2);
		System.out.println("Unique Numbers from both the list are : " + uniqueNumbers);
	}
}