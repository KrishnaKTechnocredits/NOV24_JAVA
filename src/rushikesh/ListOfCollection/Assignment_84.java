package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_84 {

	List<String> getListOfUniqueName(String[] arr) {
		List<String> list = Arrays.asList(arr);
		List<String> listOfUniqueName = new ArrayList<String>();
		for (int index = 0; index < list.size(); index++) {
			if (!listOfUniqueName.contains(list.get(index))) {
				listOfUniqueName.add(list.get(index));
			}
		}
		return listOfUniqueName;
	}

	public static void main(String[] args) {
		Assignment_84 assignment_84 = new Assignment_84();
		String[] arr = { "Harish", "Pramod", "Harish", "Krishna", "Jeet", "Krishna" };
		List<String> output = assignment_84.getListOfUniqueName(arr);
		System.out.println(output);
	}

}
