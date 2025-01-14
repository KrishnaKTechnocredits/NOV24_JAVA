package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_82 {

	List<Integer> getListOfDuplicateElement(Integer[] arr) {
		List<Integer> listOfElement = Arrays.asList(arr);
		List<Integer> listOfDuplicateElement = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = listOfElement.get(index);
			int curentIndex = listOfElement.indexOf(num);
			int lastIndex = listOfElement.lastIndexOf(num);
			if (curentIndex != lastIndex) {
				if (!listOfDuplicateElement.contains(num)) {
					listOfDuplicateElement.add(num);
				}
			}
		}
		return listOfDuplicateElement;
	}

	public static void main(String[] args) {
		Assignment_82 assignment_82 = new Assignment_82();
		Integer[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		List<Integer> output = assignment_82.getListOfDuplicateElement(arr);
		System.out.println(output);

	}
}
