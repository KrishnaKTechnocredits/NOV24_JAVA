package kishor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Assignment88_ReturnDuplicate {

	List<Integer> getDuplicateNum(List<Integer> list) {
		HashSet<Integer> set = new HashSet<Integer>();
		List<Integer> duplicateList = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			int num = list.get(i);
			//set not take duplicate num
			if (set.add(num) == true) {
				set.add(num);
			} else {
				duplicateList.add(num);
			}
		}
		return duplicateList;

	}

	public static void main(String[] args) {
		Integer[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		List<Integer> list = Arrays.asList(arr);
		Assignment88_ReturnDuplicate assignment88 = new Assignment88_ReturnDuplicate();
		List<Integer> ans = assignment88.getDuplicateNum(list);
		System.out.println(ans);
	}
}
