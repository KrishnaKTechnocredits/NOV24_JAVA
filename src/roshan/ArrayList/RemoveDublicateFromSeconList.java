package roshan.ArrayList;

import java.util.*;

public class RemoveDublicateFromSeconList {
	List<Integer> getUniqueElementFromBothList(Integer[] arr1, Integer[] arr2) {
		List<Integer> orignalListA = new ArrayList<>(Arrays.asList(arr1));
		List<Integer> orignalListB = new ArrayList<>(Arrays.asList(arr2));
		orignalListB.removeAll(orignalListA); // need o remove from list 2 then like this
		orignalListA.addAll(orignalListB); // add list 2 in list 1 write like this
		return orignalListA;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 10, 20, 30, 40 };
		Integer[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		RemoveDublicateFromSeconList removedublicatefromseconlist = new RemoveDublicateFromSeconList();
		List<Integer> output = removedublicatefromseconlist.getUniqueElementFromBothList(arr1, arr2);
		System.out.println(output);
	}

}

/*
 * Assignment - 85: 14th Jan
 * 
 * Remove duplicate from 2 list, and return all the unique elements from both
 * list.
 * 
 * input : [10, 20, 30, 40] [20,30,60,70,80,90,100,101,44,55,66,77] output :
 * [10,20,30,40,60,70,80,90,100,101,44,55,66,77]
 */