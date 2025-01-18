package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]*/

public class Assignment83 {
	public static void main(String[] args) {
		Assignment83 assignment83 = new Assignment83();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println("Input array is: \n " + Arrays.toString(arr));
		ArrayList<String> outputList = new ArrayList<String>();
		outputList = assignment83.getDuplicateArrayListWithNames(arr);
		System.out.println("output list is with only duplciates name: \n" + outputList);
	}

	private ArrayList<String> getDuplicateArrayListWithNames(String[] arr) {
		// convert the array to new ArrayList

		ArrayList<String> newArrayList = convertArrayToList(arr);// new arryalist is called

		ArrayList<String> outputList = new ArrayList<String>();
		// perform all operation on arraylist
		for (String names : arr) {
			if (newArrayList.indexOf(names) != newArrayList.lastIndexOf(names)) {
				// check if its added already in new output array of duplicate names
				if (!outputList.contains(names)) {
					outputList.add(names);
				}
			}
		}

		return outputList;

	}
	//common method to conver array to arraylist
	public  ArrayList<String> convertArrayToList(String[] arr) {
		ArrayList<String> arrayList = new ArrayList<String>();
		// use enhance for loop
		for (String names : arr) {
			arrayList.add(names);// arraylist is created
		}
		return arrayList;
	}
}
