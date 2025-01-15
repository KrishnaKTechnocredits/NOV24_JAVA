package rushikesh.SetOfColleaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment_87 {

	List<Integer> getDuplicateElement(int[] arr) {
		List<Integer> listOfDuplicateElement = new ArrayList<Integer>();
		Set<Integer> hashSet = new HashSet<Integer>();
		for (int index = 0; index < arr.length; index++) {
			boolean h = hashSet.add(arr[index]);
			if (h == false) {
				listOfDuplicateElement.add(arr[index]);
			}
		}
		return listOfDuplicateElement;
	}

	public static void main(String[] args) {
		Assignment_87 assignment_87 = new Assignment_87();
		int[] arr = { 33, 22, 44, 33, 12, 15, 16, 22 };
		List<Integer> list = assignment_87.getDuplicateElement(arr);
		System.out.println(list);
	}
}
