package roshan.ArrayList;

import java.util.*;

public class FindAllDublicateElement {
	void dublicateElement(List<Integer> al) {
		for (int i = 0; i < al.size(); i++) {
			int element = al.get(i); // mistake made here without this index of can not be used
			int indexOfNum = al.indexOf(element);
			int lastIndexOfNum = al.lastIndexOf(element);
			if (indexOfNum != lastIndexOfNum && i == indexOfNum) {
				// checking if indexOfNum and lastIndexOfNum are not equals which means number
				// is duplicate and i == indexOfNum ensures that for duplicate number, we print
				// the statement only once
				System.out.println(element + " is Dublicate. " + " its first index is " + indexOfNum
						+ " and last index is " + lastIndexOfNum);

			}

		}

	}

	public static void main(String[] args) {
		List<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(99);
		al.add(10);
		al.add(10);
		al.add(77);
		al.add(55);
		al.add(46);
		al.add(99);
		FindAllDublicateElement findalldublicateelement = new FindAllDublicateElement();
		findalldublicateelement.dublicateElement(al);
	}
}

/*
 * Assignment - 79 : 11th Jan Find out all the duplicate elements from given
 * arrayList.
 * 
 * input : [10, 99, 10, 10, 77, 55, 46, 99]' output : 10 is duplicate, at index
 * 0 and 3 99 is duplicate , at index 1 and 7.
 */