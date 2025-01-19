package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_85 {

	List<Integer> getUnionOfUniqueList(int[] arr1, int[] arr2) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		for (int num : arr1) {
			list1.add(num);
		}
		for (int num : arr2) {
			list2.add(num);
		}
		list2.removeAll(list1);
		list1.addAll(list2);
		return list1;
	}

	public static void main(String[] args) {
		Assignment_85 assignment_85 = new Assignment_85();
		int[] arr1 = { 10, 20, 30, 40 };
		int[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		List<Integer> listOfUnion = assignment_85.getUnionOfUniqueList(arr1, arr2);
		System.out.println(listOfUnion);
	}
}
