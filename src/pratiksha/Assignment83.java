//Assignment - 83: 12th Jan
//Return the list of duplicate names from given Array. [IMP]
//
//String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
//output : ["Harish", "Krishna"]


package pratiksha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment83 {
	List<String> getDuplicateString(String[] array) {
		List<String> list = Arrays.asList(array);
		List<String> output = new ArrayList<String>();

		for (int i = 0; i < list.size(); i++) {
			String name = list.get(i);
			if (list.contains(name) && i != list.indexOf(name)) {
				if (!output.contains(name)) {
					output.add(name);
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] array = { "Harish", "Mitali", "Maulik", "Harish", "Krishna", "Maulik" };
		System.out.println(Arrays.toString(array));
		Assignment83 assignment83 = new Assignment83();
		System.out.println(assignment83.getDuplicateString(array));
	}
}
