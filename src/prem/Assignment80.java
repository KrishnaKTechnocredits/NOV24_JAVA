package prem;

import java.util.ArrayList;

public class Assignment80 {

	ArrayList<Integer> getOriginalList(int[] input) {
		ArrayList<Integer> originalList = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
		}
		return originalList;
	}

	ArrayList<Integer> getindexCount(int[] input, int num) {
		ArrayList<Integer> allIndex = new ArrayList<Integer>();
		for (int index = 0; index < input.length; index++) {
			ArrayList<Integer> originalList = getOriginalList(input);
			int lastIndex = originalList.lastIndexOf(num);
			int firstIndex = originalList.indexOf(num);
			if (firstIndex != lastIndex && originalList.get(index) == num)
				allIndex.add(index);
		}
		return allIndex;
	}

	void getDuplicateElements(int[] input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < input.length; i++) {
			int num = input[i];
			ArrayList<Integer> index = getindexCount(input, num);
			ArrayList<Integer> originalList = getOriginalList(input);
			int lastIndex = originalList.lastIndexOf(num);
			int firstIndex = originalList.indexOf(num);
			if (!output.contains(num) && firstIndex != lastIndex) {
				output.add(num);
				System.out.println(num + " is duplicate, at index " + index);
			} else {

			}
		}
	}

	public static void main(String[] args) {
		int[] input = { 10, 99, 10, 10, 77, 55, 46, 99 };
		Assignment80 assign80 = new Assignment80();
		assign80.getDuplicateElements(input);
	}
}
