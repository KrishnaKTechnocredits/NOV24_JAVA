package pratiksha;

import java.util.HashSet;
import java.util.Set;

public class Assignment88 {
	
	public static void main(String[] args) {
		int[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		System.out.println(getDuplicateElement(arr));
	}
	static Set<Integer> getDuplicateElement(int[] arr) {
		Set<Integer> list = new HashSet<>();
		Set<Integer> duplicateList = new HashSet<>();
		for (int number : arr) {
			if (!list.add(number)) {
				duplicateList.add(number);
			}
		}
		return duplicateList;
	}

}
