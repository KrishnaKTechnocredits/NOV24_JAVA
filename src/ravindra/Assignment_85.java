package ravindra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_85 {
	public static void main(String[] args) {
		Integer[] arr1 = { 10, 20, 30, 40 };
		List<Integer> arrlist1 = Arrays.asList(arr1);
		List<Integer> list1 = new ArrayList<Integer>(arrlist1);
	
		Integer[] arr2 = { 20, 30, 60, 70, 80, 90, 100, 101, 44, 55, 66, 77 };
		List<Integer> arrlist2 = Arrays.asList(arr2);
		List<Integer> list2 = new ArrayList<Integer>(arrlist2);
		list2.removeAll(list1);
		list1.addAll(list2);
		System.out.println(list1);
	}
}
