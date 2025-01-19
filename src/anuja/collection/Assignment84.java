package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]*/
public class Assignment84 {
	public static void main(String[] args) {
		Assignment84 assignment84 = new Assignment84();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		System.out.println("Input array is: \n " + Arrays.toString(arr) +"\n");
		ArrayList<String> outputList = new ArrayList<String>();
		outputList = assignment84.getUniqueNames(arr);
		System.out.println("output list is with only unique name: \n" + outputList);
	}

	private ArrayList<String> getUniqueNames(String[] arr) {
		ArrayList<String> newArrayList = convertArrayToList(arr);// new arryalist is called

		ArrayList<String> uniqueList = new ArrayList<String>(); // list to store unique

		// perform all operation on arraylist
		for (String names : arr) {
			// check if its added already in new output array of duplicate names, no need of indexof 
			//comparison coz we want all unique names.
			if (!uniqueList.contains(names)) {
				uniqueList.add(names);
			}
		}
		return uniqueList;
	}

	// common method to convert array to arraylist
	public ArrayList<String> convertArrayToList(String[] arr) {
		ArrayList<String> arrayList = new ArrayList<String>();
		// use enhance for loop
		for (String names : arr) {
			arrayList.add(names);// arraylist is created
		}
		return arrayList;
	}
}
