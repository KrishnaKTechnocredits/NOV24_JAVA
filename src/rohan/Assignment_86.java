/*
 * Assignment - 86: 14th Jan

Remove all the names from list having length less than or equal to 5 characters. 

input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
output : ["Aaruhi", "Akanksha", "Kishor"]

 */

package rohan;

import java.util.*;

public class Assignment_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_86 assignment = new Assignment_86();
		String[] arr = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor", "ABC", "jeet" };
		assignment.removeWords(arr);
	}

	List<String> removeWords(String[] arr) {
		List<String> al = new ArrayList<String>(Arrays.asList(arr));

		for (int i = 0; i < al.size(); i++) {
			String name = al.get(i);
			if (name.length() <= 5) {
				al.remove(name);
				i--;
			}
		}
		System.out.println("Output: " + al);
		return null;
	}

}
