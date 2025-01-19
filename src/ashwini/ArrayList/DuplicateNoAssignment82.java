package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 Assignment - 82 : 12th Jan
Return the list of duplicate numbers from given Array. [IMP]

int[] arr = {10,44,55,22,44,11,77,88,99,11};
output : [44, 11]
 */
public class DuplicateNoAssignment82 {

	List<Integer> getOriginalList(int[] arr) {
		List<Integer> originalList = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			originalList.add(arr[index]);
		}
		return originalList;
	}

	List<Integer> getListOfDuplicateNumbers(List<Integer> originalList) {
		List<Integer> duplicateNumberList = new ArrayList<Integer>();
		for (int index = 0; index < originalList.size(); index++) {
			int num = originalList.get(index);
			if (originalList.indexOf(num) != originalList.lastIndexOf(num)) {
				if (!duplicateNumberList.contains(num)) {
					duplicateNumberList.add(num);
				}
			}
		}
		return duplicateNumberList;
	}

	public static void main(String[] args) {
		DuplicateNoAssignment82 a82 = new DuplicateNoAssignment82();
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> ans = a82.getOriginalList(arr);
		List<Integer> ans1 = a82.getListOfDuplicateNumbers(ans);
		System.out.println(ans);
		System.out.println(ans1);
	}

}
