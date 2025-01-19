package kishor;
//Return the list of duplicate numbers from given Array. [IMP]
//int[] arr = {10,44,55,22,44,11,77,88,99,11};
//output : [44, 11]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment82_ArrayListDuplicateNum {

	List<Integer> getArrayFromArrayList(int[] arr) {
		List<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			originalList.add(arr[i]);
		}
		return originalList;
	}

	List<Integer> getDuplicateList(int[] arr) {
		List<Integer> originalList = getArrayFromArrayList(arr);
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
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		;
		Assignment82_ArrayListDuplicateNum assignment82 = new Assignment82_ArrayListDuplicateNum();
		List<Integer> ans = assignment82.getDuplicateList(arr);
		System.out.println(ans);
	}
}
