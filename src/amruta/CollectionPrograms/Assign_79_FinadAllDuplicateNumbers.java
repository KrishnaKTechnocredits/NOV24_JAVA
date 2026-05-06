/*
 * Assignment - 79 : 11th Jan
Find out all the duplicate elements from given arrayList.

input : [10, 99, 10, 10, 77, 55, 46, 99]'
output : 10 is duplicate, at index 0 and 3 
         99 is duplicate , at index 1 and 7.
 */
package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class Assign_79_FinadAllDuplicateNumbers {

	void findAllDuplicateElements(List<Integer> list) {

		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			if (list.indexOf(num) != list.lastIndexOf(num) && index == list.indexOf(num))
				System.out.println(
						"\n" + num + "is duplicate, at index " + list.indexOf(num) + " and " + list.lastIndexOf(num));
		}
	}

	public static void main(String[] args) {
		List<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(99);
		input.add(10);
		input.add(10);
		input.add(77);
		input.add(55);
		input.add(46);
		input.add(99);
		System.out.println("Input : " + input);
		new Assign_79_FinadAllDuplicateNumbers().findAllDuplicateElements(input);
	}
}
