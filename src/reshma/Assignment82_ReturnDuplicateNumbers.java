package reshma;
/* Return the list of duplicate numbers from given Array. [IMP]
  Input : int[] arr = {10,44,55,22,44,11,77,88,99,11};
  Output : [44, 11] */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment82_ReturnDuplicateNumbers {
	List<Integer> getDuplicateNumbers(Integer[] input) {
		List<Integer> originalList = Arrays.asList(input);
		List<Integer> duplicateList = new ArrayList<Integer>();
		for (int i = 0; i < originalList.size(); i++) {
			int num = originalList.get(i);
			if (originalList.indexOf(num) != originalList.lastIndexOf(num)) {
				if (!duplicateList.contains(num)) {
					duplicateList.add(num);
				}
			}
		}
		return duplicateList;
	}

	public static void main(String[] args) {
		Assignment82_ReturnDuplicateNumbers a82 = new Assignment82_ReturnDuplicateNumbers();
		Integer[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };		
		List<Integer> ans = a82.getDuplicateNumbers(arr);
		System.out.println("Output: " +ans);
		}
}
