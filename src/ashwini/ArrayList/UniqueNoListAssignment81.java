package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 Assignment - 81 : 12th Jan
Return the unique list of numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
 */

public class UniqueNoListAssignment81 {

	List<Integer> getUniqueNumberList(int[] input) {
		List<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			int num = input[i];
			if (!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		UniqueNoListAssignment81 ui = new UniqueNoListAssignment81();
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> ans = ui.getUniqueNumberList(arr);
		System.out.println(ans);
	}
}
