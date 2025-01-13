package prem;

import java.util.ArrayList;
import java.util.List;

public class Assignment82 {
	
	ArrayList<Integer> getOriginalList(int[] input) {
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
		}
		return originalList;
	}

	ArrayList<Integer> getDuplicateNumberList(int[] arr) {
		ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
		List<Integer> originalList = getOriginalList(arr);
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			int lastIndex = originalList.lastIndexOf(num);
			int firstIndex = originalList.indexOf(num);
			if (!listOfNumbers.contains(num) &&firstIndex != lastIndex) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 44, 55, 22, 44, 11, 77, 88, 99, 11 };
		Assignment82 assign82 = new Assignment82();
		ArrayList<Integer> output = assign82.getDuplicateNumberList(arr);
		System.out.println(output);
	}
}
