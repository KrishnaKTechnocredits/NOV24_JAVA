package prem;

import java.util.ArrayList;
import java.util.List;

public class Assignment83 {
	
	ArrayList<String> getOriginalList(String[] input) {
		ArrayList<String> originalList = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			originalList.add(input[i]);
		}
		return originalList;
	}

	ArrayList<String> getDuplicateNamesList(String[] arr) {
		ArrayList<String> listOfNumbers = new ArrayList<String>();
		List<String> originalList = getOriginalList(arr);
		for (int i = 0; i < arr.length; i++) {
			String num = arr[i];
			int lastIndex = originalList.lastIndexOf(num);
			int firstIndex = originalList.indexOf(num);
			if (!listOfNumbers.contains(num) &&firstIndex != lastIndex) {
				listOfNumbers.add(num);
			}
		}
		return listOfNumbers;
	}

	public static void main(String[] args) {
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		Assignment83 assign83 = new Assignment83();
		ArrayList<String> output = assign83.getDuplicateNamesList(arr);
		System.out.println(output);
	}

}
