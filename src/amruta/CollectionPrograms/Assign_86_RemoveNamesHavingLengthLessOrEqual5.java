/*
 * Assignment - 86: 14th Jan
 * 
 * Remove all the names from list having length less than or equal to 5
 * characters.
 * 
 * Input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"]
 * 
 * Output : ["Aaruhi", "Akanksha", "Kishor"]
 */

package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Assign_86_RemoveNamesHavingLengthLessOrEqual5 {

	// using for loop
	List<String> removeNamesHavingLengthLessOrEqual5_logic1(String[] arr) {
		List<String> list = new ArrayList<String>();

		for (int index = 0; index < arr.length; index++) {
			if (arr[index].length() <= 5)
				continue;
			else
				list.add(arr[index]);
		}

		return list;
	}

	// using for loop to iterate list elements
	List<String> removeNamesHavingLengthLessOrEqual5_logic2(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));

		for (int index = 0; index < list.size(); index++) {
			String str = list.get(index);
			if (str.length() <= 5) {
				list.remove(str);
				index--;
			}	
		}

		return list;
	}

	// using iterator() to iterate elements
	List<String> removeNamesHavingLengthLessOrEqual5_logic3(String[] arr) {
		List<String> list = new ArrayList<String>(Arrays.asList(arr));

		Iterator<String> iterator = list.iterator();

		while (iterator.hasNext()) {
			String str = iterator.next();
			if (str.length() <= 5) {
				iterator.remove(); // removes the element from list
			}
		}
		return list;
	}

	public static void main(String[] args) {
		String[] input = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		System.out.println("Original Array : " + Arrays.toString(input));
		System.out.println("\nLists after removing name having length less than or equal to 5 : ");
		Assign_86_RemoveNamesHavingLengthLessOrEqual5 a86 = new Assign_86_RemoveNamesHavingLengthLessOrEqual5();
		List<String> list1 = a86.removeNamesHavingLengthLessOrEqual5_logic1(input);
		System.out.println("\n" + list1);
		List<String> list2 = a86.removeNamesHavingLengthLessOrEqual5_logic2(input);
		System.out.println("\n" + list2);
		List<String> list3 = a86.removeNamesHavingLengthLessOrEqual5_logic3(input);
		System.out.println("\n" + list3);
	}
}