package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 84: 12th Jan
Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]
 */
public class Assignment84 {
	
	List<String> getDuplicateNames(String[] arr){
		List<String> listOfNames = Arrays.asList(arr);
		List<String> listOfUniqueNames = new ArrayList<String>();
		for(int i=0;i<listOfNames.size();i++) {
			String currentName = listOfNames.get(i);
			if(listOfNames.indexOf(currentName)==i) {
				listOfUniqueNames.add(currentName);
			}
		}
		return listOfUniqueNames;
	}
	
	public static void main(String[] args) {
		Assignment84 assignment83 = new Assignment84();
		String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
		System.out.println("Output : "+assignment83.getDuplicateNames(arr));
	}
}