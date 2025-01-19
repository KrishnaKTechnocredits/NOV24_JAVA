package kavita;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};


List<Integer> getUniqueNumberList(int[] input){
	List<Integer> listOfNumbers = new ArrayList<Integer>();
	
}

output : [10,44,55,22,11,77,88,99]

Hint : contains method of ArrayList.
Time: */
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
		Assignment81 assignment81 = new Assignment81();
		System.out.println("Output: " + assignment81.getUniqueList(output));
	}
}
