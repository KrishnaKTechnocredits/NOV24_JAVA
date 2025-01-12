//Assignment - 82 : 12th Jan
//Return the list of duplicate numbers from given Array. [IMP]
//
//int[] arr = {10,44,55,22,44,11,77,88,99,11};
//output : [44, 11]

package fazrana.arrayList;

import java.util.*;

public class FAssignment82 {
	List<Integer> duplicateNumber(int[] array) {
		List<Integer> input = new ArrayList<Integer>();
		List<Integer> output1 = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			input.add(array[i]);
		}

		for (int i = 0; i < input.size(); i++) {
			int num = input.get(i);
			if (input.indexOf(num) != input.lastIndexOf(num)) {
				if (!output1.contains(array[i])) {
					output1.add(array[i]);
				}
			}
		}
		return output1;
	}

	public static void main(String[] args) {
		int[] output = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		System.out.println("input: " + Arrays.toString(output));
		FAssignment82 fassignment82 = new FAssignment82();
		System.out.println("Output: " + fassignment82.duplicateNumber(output));
	}
}
