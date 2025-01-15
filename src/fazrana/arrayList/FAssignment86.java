//Assignment - 86: 14th Jan
//
//Remove all the names from list having length less than or equal to 5 characters. 
//
//input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
//output : ["Aaruhi", "Akanksha", "Kishor"]

package fazrana.arrayList;

import java.util.*;

public class FAssignment86 {

	List<String> getRemoveNameArray(String[] array) {
		List<String> list = new ArrayList<String>(Arrays.asList(array));
		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (name.length() <= 5) {
				list.remove(i);
				i--;
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		System.out.println("Input: " + Arrays.toString(input));
		FAssignment86 fassignment86 = new FAssignment86();
		System.out.println("Output: " + fassignment86.getRemoveNameArray(input));
	}
}
