package prem;

import java.util.ArrayList;

public class Assignment84 {

	ArrayList<String> getOriginalList(String[] input) {
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
		}
		return originalList;
	}

	ArrayList<String> getUniqueNamesList(String[] arr) {
		ArrayList<String> listOfNumbers = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			String num = arr[i];
			if (!listOfNumbers.contains(num)) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		Assignment84 assign84 = new Assignment84();
		ArrayList<String> output = assign84.getUniqueNamesList(arr);
		System.out.println(output);
	}
}
