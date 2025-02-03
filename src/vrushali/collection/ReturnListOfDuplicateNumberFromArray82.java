package vrushali.collection;

import java.util.ArrayList;
import java.util.List;

//Assignment - 82 : 12th Jan
//Return the list of duplicate numbers from given Array. [IMP]
//
//int[] arr = {10,44,55,22,44,11,77,88,99,11};
//output : [44, 11]

public class ReturnListOfDuplicateNumberFromArray82 {
	List<Integer> getListOfDuplicateNum(int[] numArray) {
		List<Integer> listOfDuplicateNum = new ArrayList<Integer>();
		List<Integer> listOfOriginalNum = new ArrayList<Integer>();
		for (int i = 0; i < numArray.length; i++) {
			listOfOriginalNum.add(numArray[i]);
		}
		for (int i = 0; i < numArray.length; i++) {
			if (listOfOriginalNum.indexOf(numArray[i]) != listOfOriginalNum.lastIndexOf(numArray[i])
					&& !listOfDuplicateNum.contains(numArray[i])) {
				listOfDuplicateNum.add(numArray[i]);
			}
		}
		return listOfDuplicateNum;
	}

	public static void main(String[] args) {
		ReturnListOfDuplicateNumberFromArray82 returnListOfDuplicateNumberFromArray = new ReturnListOfDuplicateNumberFromArray82();
		int[] numArray = { 10, 44, 55, 22, 11, 22, 44, 77, 88, 99, 11 };
		List<Integer> listOfDuplicateNum = returnListOfDuplicateNumberFromArray.getListOfDuplicateNum(numArray);
		System.out.println("List Of Duplicate Numbers From Array : " + listOfDuplicateNum);
	}
}
