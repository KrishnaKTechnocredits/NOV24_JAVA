package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_83 {

	List<String> getListOfDuplicateName(String[] arr) {
		List<String> list = Arrays.asList(arr);
		List<String> listOfDuplicateName = new ArrayList<String>();
		for (int index = 0; index < list.size(); index++) {
			String name = list.get(index);
			int currentIndex = list.indexOf(name);
			int lastIndex = list.lastIndexOf(name);
			if (currentIndex != lastIndex) {
				if (!listOfDuplicateName.contains(name)) {
					listOfDuplicateName.add(name);
				}
			}
		}
		return listOfDuplicateName;
	}

	public static void main(String[] args) {
		Assignment_83 assignment_83 = new Assignment_83();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> output = assignment_83.getListOfDuplicateName(arr);
		System.out.println(output);
	}
}
