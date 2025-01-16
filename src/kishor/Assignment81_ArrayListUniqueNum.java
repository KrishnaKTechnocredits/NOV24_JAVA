package kishor;

import java.util.ArrayList;
import java.util.List;

//Return the unique list of numbers from given Array. [IMP]
//
//int[] arr = {10,44,55,22,44,11,77,88,99,11};

public class Assignment81_ArrayListUniqueNum {

	List<Integer> getUniqueNumber(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment81_ArrayListUniqueNum assignment81 = new Assignment81_ArrayListUniqueNum();
		List<Integer> ans = assignment81.getUniqueNumber(arr);
		System.out.println(ans);
	}
}
