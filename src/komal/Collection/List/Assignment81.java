//Assignment - 81 : 12th Jan
//Return the unique list of numbers from given Array. [IMP]
//
//int[] arr = {10,44,55,22,44,11,77,88,99,11};
//
//
//List<Integer> getUniqueNumberList(int[] input){
//	List<Integer> listOfNumbers = new ArrayList<Integer>();
//	
//}
//
//output : [10,44,55,22,11,77,88,99]
//
//Hint : contains method of ArrayList.

package komal.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class Assignment81 {
	List<Integer> getUniqueList(Integer[] arr) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {

			if (!listOfNumbers.contains(arr[i])) {
				listOfNumbers.add(arr[i]);
			}

		}
		return listOfNumbers;
	}

	public static void main(String args[]) {
		Integer[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> uniqueList = new Assignment81().getUniqueList(arr);
		System.out.print("Unique number list is : => " + uniqueList);
	}

}
