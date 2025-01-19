package Assignments_Collections_Framework_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Assignment80 {
	

	void printDuplicateNumbers(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		for(int num : arr) {
			list.add(num);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> listOfIndexes = new ArrayList<Integer>();
		
		for(int i = 0;i<list.size();i++) {
			if(list.contains(arr[i])) {
				if(list.indexOf(arr[i]) != list.lastIndexOf(arr[i])) {
					if(!list2.contains(arr[i])) {
						list2.add(arr[i]);
						for(int j = 0;j<arr.length;j++) {
							if(arr[i] == arr[j]) {
								listOfIndexes.add(j);
							}
						}
						System.out.println(list2.get(i) +" is duplicate at index : " + listOfIndexes);
						listOfIndexes.clear();
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99,99 };
		new Assignment80().printDuplicateNumbers(input);
	}
}
