package roshan.ArrayList;

import java.util.*;

public class ReturnUniqueNosFromArray {
	List<Integer> reurnUniqueList(int[] arr) {
		List<Integer> finalList = new ArrayList<>();
		for (int i = 0; i <= arr.length - 1; i++) { // for array remeber to add lenth-1
			int element = arr[i];
			if (!finalList.contains(element)) { // note contain method call on finalList(which we have created other
												// wise not allowed to call on array directly
												// note using this we can check element is in list or not
												// if not so can be added in list no need to create new method(made
												// mistake like this
				finalList.add(element);
			}
		}
		return finalList;

	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		ReturnUniqueNosFromArray returnUniqueNosFromArray = new ReturnUniqueNosFromArray();
		List<Integer> output = returnUniqueNosFromArray.reurnUniqueList(arr);
		System.out.println(output);

	}
}

/*
 * Assignment - 81 : 12th Jan Return the unique list of numbers from given
 * Array. [IMP]
 * 
 * int[] arr = {10,44,55,22,44,11,77,88,99,11};
 * 
 * 
 * List<Integer> getUniqueNumberList(int[] input){ List<Integer> listOfNumbers =
 * new ArrayList<Integer>();
 * 
 * }
 * 
 * output : [10,44,55,22,11,77,88,99]
 * 
 * Hint : contains method of ArrayList.
 */
