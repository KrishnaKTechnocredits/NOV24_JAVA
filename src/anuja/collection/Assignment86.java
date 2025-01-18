package anuja.collection;

import java.util.ArrayList;
import java.util.Arrays;

/*Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]*/
public class Assignment86 {

	public static void main(String[] args) {
		Assignment86 assignment86 = new Assignment86();
		String[] arr = {"Aaruhi","Ansh", "Akanksha", "Eva", "jeet"};
		ArrayList<String> namesList = new ArrayList<String>(Arrays.asList(arr));
		System.out.println("input list: \n" +namesList +"\n\n");
		assignment86.getListWithLessThan5Char(namesList);
	}

	private void getListWithLessThan5Char(ArrayList<String> namesList) {
		for(int i = 0 ; i<namesList.size() ; i++) {
			String name = namesList.get(i);
			if(name.length() <= 5) {
				namesList.remove(i);
				i--; //after each remove, index of for loop increased but value adjust upward,
				//Adjust index after removal to avoid skipping elements.
				//make sure use index-- whenever remove opetaion applis on for loop
			}
		}
		System.out.println("output list after removing names less than 5 char \n"+ namesList);
	}
}
