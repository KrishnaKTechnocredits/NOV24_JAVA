/*
 * Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign_82_ReturnListOfDuplicateNumbers {
	
	//Logic 1
	List<Integer> returnDuplicateNumberList(Integer[] arr) {
		List<Integer> originalList = Arrays.asList(arr);	//Convert Array to List
		
		ArrayList<Integer> listOfDuplicateNum = new ArrayList<Integer>();
		
		for (int index = 0; index < arr.length; index++) {
			int num = originalList.get(index);
			int firstNum = originalList.indexOf(num);
			int lastNum = originalList.lastIndexOf(num);
			
			if (firstNum != lastNum  && index == firstNum) //check num is duplicate or Not and It should processed only once
				listOfDuplicateNum.add(num);
		}
		return listOfDuplicateNum;
	}	
	
	//Logic 2
	List<Integer> returnDuplicateNumberList1(Integer[] arr) {
		List<Integer> originalList = Arrays.asList(arr);
		
		ArrayList<Integer> listOfDuplicateNum = new ArrayList<Integer>();
		
		for (int index = 0; index < arr.length; index++) {
			int num = originalList.get(index);
			int firstNum = originalList.indexOf(num);
			int lastNum = originalList.lastIndexOf(num);
			
			//Code change
			if (firstNum != lastNum  && !listOfDuplicateNum.contains(num))
				listOfDuplicateNum.add(num);
		}
		return listOfDuplicateNum;
	}	

	public static void main(String[] args) {
		Integer[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11, 10, 99 };

		System.out.println("Input - Original list - " + Arrays.toString(arr));

		Assign_82_ReturnListOfDuplicateNumbers a81 = new Assign_82_ReturnListOfDuplicateNumbers();
		List<Integer> listOfDuplicateNum = a81.returnDuplicateNumberList(arr);
		System.out.println("Output - List of duplicate Numbers - " + listOfDuplicateNum);
		
		List<Integer> listOfDuplicateNum1 = a81.returnDuplicateNumberList1(arr);
		System.out.println("Output - List of duplicate Numbers - " + listOfDuplicateNum1);
	}
}
