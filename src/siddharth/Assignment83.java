package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 83: 12th Jan
Return the list of duplicate names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Krishna"]
 */
public class Assignment83 {
	
	List<String> getDuplicateNames(String[] arr){
		List<String> listOfNames = Arrays.asList(arr);
		List<String> listOfDup = new ArrayList<String>();
		for(int i=0;i<listOfNames.size();i++) {
			String currentName = listOfNames.get(i);
			if(listOfNames.indexOf(currentName)!=listOfNames.lastIndexOf(currentName) && (i==listOfNames.indexOf(currentName))) {
				listOfDup.add(currentName);
			}
		}
		return listOfDup;
	}
	
	public static void main(String[] args) {
		Assignment83 assignment83 = new Assignment83();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println("Output : "+assignment83.getDuplicateNames(arr));
	}
}
