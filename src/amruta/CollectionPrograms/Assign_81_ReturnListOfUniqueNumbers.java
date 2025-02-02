/*
 * Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assign_81_ReturnListOfUniqueNumbers {
	

	List<Integer> FindUniqueElements(int[] arr) {
		ArrayList<Integer> listOfUniqueNum = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			
			//optimized
			if (!listOfUniqueNum.contains(arr[index]))
				listOfUniqueNum.add(arr[index]);
		}
		return listOfUniqueNum;
	}
	
	/*List<Integer> FindUniqueElements(int[] arr) {
		ArrayList<Integer> listOfUniqueNum = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {

			if (listOfUniqueNum.contains(arr[index]))
				continue;
			else
				listOfUniqueNum.add(arr[index]);
		}
		return listOfUniqueNum;
	}*/

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11, 10, 99 };

		System.out.println("Input -- " + Arrays.toString(arr));

		Assign_81_ReturnListOfUniqueNumbers a81 = new Assign_81_ReturnListOfUniqueNumbers();
		List<Integer> listOfUniqueNum = a81.FindUniqueElements(arr);
		System.out.println("Output - " + listOfUniqueNum);
	}
}
