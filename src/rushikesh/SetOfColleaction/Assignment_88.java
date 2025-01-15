package rushikesh.SetOfColleaction;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Assignment_88 {

	void printListOfElementWithoutDuplicate(Integer[] arr) {
		Set<Integer> hashSet = new HashSet<Integer>(Arrays.asList(arr));
		System.out.println(hashSet);

	}

	public static void main(String[] args) {
		Assignment_88 assignment_88 = new Assignment_88();
		Integer[] arr = { 10, 20, 20, 20, 30, 30, 40, 50, 40, 10 };
		assignment_88.printListOfElementWithoutDuplicate(arr);
	}
}
