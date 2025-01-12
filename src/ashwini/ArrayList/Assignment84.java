package ashwini.ArrayList;

import java.util.ArrayList;
import java.util.List;

/*
 Assignment - 84: 12th Jan
Return the list of unique names from given Array. [IMP]

String[] arr = {"Harish", "Pramod","Harish", "Krishna", "Jeet", "Krishna"};
output : ["Harish", "Pramod", "Krishna", "Jeet"]
 */
public class Assignment84 {
	List<String> getUniqueNameList(String[] input) {
		List<String> listOfNames = new ArrayList<String>();
		for (int i = 0; i < input.length; i++) {
			String name = input[i];
			if (!listOfNames.contains(name)) {
				listOfNames.add(name);
			}
		}
		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment84 ui = new Assignment84();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> ans = ui.getUniqueNameList(arr);
		System.out.println(ans);
	}

}
