package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment79 {

	void printDuplicateNumbers(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for(int num : arr) {
			list.add(num);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		
		for(int i = 0;i<list.size();i++) {
			if(list.contains(arr[i])) {
				if(list.indexOf(arr[i]) != list.lastIndexOf(arr[i])) {
					if(!list2.contains(arr[i])) {
						list2.add(arr[i]);
						System.out.println(arr[i] + " is duplicate at " + list.indexOf(arr[i])+ " and " + list.lastIndexOf(arr[i]));
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		new Assignment79().printDuplicateNumbers(input);
	}
}
