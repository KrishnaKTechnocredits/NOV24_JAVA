package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.List;

public class Assignment_79 {

	void findDuplicateElementFromList(int[] input) {
		List<Integer> originalList = convertArrayIntoList(input);
		for (int index = 0; index < originalList.size(); index++) {
			int num = originalList.get(index);
			int currentIndex = originalList.indexOf(num);
			int lastIndex = originalList.lastIndexOf(num);
			if (currentIndex != lastIndex && currentIndex == index) {
				System.out.println(num + " is duplicate at index " + currentIndex + " and " + lastIndex);
			}
		}
	}

	List<Integer> convertArrayIntoList(int[] input) {
		List<Integer> listOfElement = new ArrayList<Integer>();
		for (int index = 0; index < input.length; index++) {
			listOfElement.add(input[index]);
		}
		return listOfElement;
	}

	public static void main(String[] args) {
		Assignment_79 assignment_79 = new Assignment_79();
		int[] arr = { 10, 99, 10, 10, 77, 55, 46, 99 };
		assignment_79.findDuplicateElementFromList(arr);
	}
}
