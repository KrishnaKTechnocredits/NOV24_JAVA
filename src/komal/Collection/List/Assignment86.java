//Assignment - 86: 14th Jan
//
//Remove all the names from list having length less than or equal to 5 characters. 
//
//input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
//output : ["Aaruhi", "Akanksha", "Kishor"]

package komal.Collection.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Assignment86 {
	void listOfLength() {

		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		ArrayList<String> list = new ArrayList<String>(Arrays.asList(input));
		for (int i = 0; i < list.size(); i++) {
			String currentName = list.get(i);
			if (currentName.length() <= 5) {
				list.remove(currentName);
			}
		}
		System.out.print("All the names from list having length less than or equal to 5 characters => " + list);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment86().listOfLength();
	}
}
