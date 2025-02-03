package vrushali.collection;

import java.util.*;

//Assignment - 79 : 11th Jan
//Find out all the duplicate elements from given arrayList.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99]'
//output : 10 is duplicate, at index 0 and 3 
//         99 is duplicate , at index 1 and 7.

public class FindDuplicateNumberFromNumberList79 {

	void findOutDuplicateNUmberFromNumberList(List<Integer> numberList) {
		int num = 0, lastIndex, index;
		for (int i = 0; i < numberList.size(); i++) {
			num = numberList.get(i);
			lastIndex = numberList.lastIndexOf(num);
			index = numberList.indexOf(num);
			if (index != lastIndex && i == index) {
				System.out.println(num + " is Duplicate Number In List");
			}
		}
	}

	public static void main(String[] args) {
		FindDuplicateNumberFromNumberList79 findDuplicateNumberFromNumberList79 = new FindDuplicateNumberFromNumberList79();
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(99);
		numberList.add(10);
		numberList.add(10);
		numberList.add(77);
		numberList.add(55);
		numberList.add(46);
		numberList.add(99);
		findDuplicateNumberFromNumberList79.findOutDuplicateNUmberFromNumberList(numberList);
	}
}
