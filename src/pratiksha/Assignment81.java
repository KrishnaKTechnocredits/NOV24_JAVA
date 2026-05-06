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

package pratiksha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment81 {
	List<Integer> getUniqueList(int[] array) {
		List<Integer> listNumber = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			if (!listNumber.contains(array[i])) {
				listNumber.add(array[i]);
			}
		}
		return listNumber;
	}

	public static void main(String[] args) {
		int[] output = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		System.out.println("Input: " + Arrays.toString(output));
		Assignment81 returnUnique = new Assignment81();
		System.out.println("Output: " + returnUnique.getUniqueList(output));
	}

}
