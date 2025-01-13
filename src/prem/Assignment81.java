package prem;

import java.util.*;

public class Assignment81 {

	ArrayList<Integer> getOriginalList(int[] input) {
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
		}
		return originalList;
	}

	ArrayList<Integer> getUniqueNumberList(int[] arr) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			if (!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment81 assign81 = new Assignment81();
		ArrayList<Integer> output = assign81.getUniqueNumberList(arr);
		System.out.println(output);
	}
}
