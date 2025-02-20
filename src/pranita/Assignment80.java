package pranita;

import java.util.ArrayList;
import java.util.List;

public class Assignment80 {

	void findDuplicateElementWithIndex(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for (int num : arr) {
			list.add(num);
		}
		for (int index = 0; index < list.size(); index++) {
			int num = list.get(index);
			int currentIndex = list.indexOf(num);
			int lastIndex = list.lastIndexOf(num);
			if (currentIndex != lastIndex && currentIndex == index) {
				List<Integer> output = getListOfDuplicateIndex(list, list.get(index));
				System.out.println(num + " is duplicate at index " + output);
			}

		}
	}

	List<Integer> getListOfDuplicateIndex(List<Integer> list, int num) {
		List<Integer> listOfDuplicateIndex = new ArrayList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index) == num) {
				listOfDuplicateIndex.add(index);
			}
		}
		return listOfDuplicateIndex;
	}

	public static void main(String[] args) {
		Assignment80 assignment_80 = new Assignment80();
		int[] arr = { 10, 99, 10, 10, 77, 55, 46, 99, 99 };
		assignment_80.findDuplicateElementWithIndex(arr);
	}
}