package vrushali.collection;

import java.util.ArrayList;
import java.util.List;

//Assignment - 80 : 11th Jan
//Find out all the duplicate elements from given arrayList and print them with their index.
//
//input : [10, 99, 10, 10, 77, 55, 46, 99,99]
//output : 10 is duplicate, at index [0, 2,3] 
//         99 is duplicate , at index [1,7,8].

public class FindDuplicateNumberFromListWithIndex80 {
	void findDuplicateNumWithTheirIndexFromList(List<Integer> numList, int num) {
		List<Integer> indexList = new ArrayList<Integer>();

		for (int index = 0; index < numList.size(); index++) {

			if (numList.get(index) == num) {
				indexList.add(index);
			}
		}
		System.out.println(num+" is Duplicate at index "+indexList);
	}

	public static void main(String[] args) {
		FindDuplicateNumberFromListWithIndex80 findDuplicateNumberFromListWithIndex80 = new FindDuplicateNumberFromListWithIndex80();
		int num=10;
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(99);
		numberList.add(10);
		numberList.add(10);
		numberList.add(77);
		numberList.add(55);
		numberList.add(46);
		numberList.add(99);
		findDuplicateNumberFromListWithIndex80.findDuplicateNumWithTheirIndexFromList(numberList,num);
		findDuplicateNumberFromListWithIndex80.findDuplicateNumWithTheirIndexFromList(numberList,99);
	}
}
