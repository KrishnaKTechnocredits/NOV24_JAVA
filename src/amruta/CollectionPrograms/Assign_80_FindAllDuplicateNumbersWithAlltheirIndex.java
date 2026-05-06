/*
 * Assignment - 80 : 11th Jan
Find out all the duplicate elements from given arrayList and print them with their index.

input : [10, 99, 10, 10, 77, 55, 46, 99,99]
output : 10 is duplicate, at index [0, 2,3] 
         99 is duplicate , at index [1,7,8].
 */
package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.List;

public class Assign_80_FindAllDuplicateNumbersWithAlltheirIndex {

	List<Integer> getIndex(List<Integer> list, int num) {
		ArrayList<Integer> indexList = new ArrayList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			if (num == list.get(index))
				indexList.add(index);
		}
		return indexList;
	}

	void printAllDuplicateElementsWithTheirIndex(List<Integer> list) {
		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			int firstIndex = list.indexOf(num);
			int lastIndex = list.lastIndexOf(num);

			if (firstIndex != lastIndex && index == firstIndex)
				System.out.println(num + " is duplicate at Indexes --> " + getIndex(list, num));
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> listOfNums = new ArrayList<Integer>();
		listOfNums.add(10);
		listOfNums.add(99);
		listOfNums.add(10);
		listOfNums.add(10);
		listOfNums.add(77);
		listOfNums.add(55);
		listOfNums.add(46);
		listOfNums.add(99);
		listOfNums.add(99);
		System.out.println("listOfNums : " + listOfNums);

		Assign_80_FindAllDuplicateNumbersWithAlltheirIndex a80 = new Assign_80_FindAllDuplicateNumbersWithAlltheirIndex();
		System.out.println("Output : ");
		a80.printAllDuplicateElementsWithTheirIndex(listOfNums);
	}
}