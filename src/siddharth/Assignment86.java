package siddharth;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Assignment - 86: 14th Jan
Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]
 */
public class Assignment86 {

	List<String> getListOfNames(String[] input){
		List<String> listOfNames = new ArrayList<String>(Arrays.asList(input));
		for(int i=0;i<listOfNames.size();i++) {
			if(listOfNames.get(i).length()<=5) {
				listOfNames.remove(listOfNames.get(i));
			}
		}
		return listOfNames;
	}
	
	public static void main(String[] args) {
		String[] input={"Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"};
		Assignment86 assignment86 = new Assignment86();
		System.out.println("Output : "+assignment86.getListOfNames(input));
	}
}
