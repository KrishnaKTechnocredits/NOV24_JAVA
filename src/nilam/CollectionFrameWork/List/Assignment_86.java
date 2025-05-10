package nilam.CollectionFrameWork.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Remove all the names from list having length less than or equal to 5 characters. 

public class Assignment_86 {

	static List<String> getProcessedNamesList(List<String> namesList) {
		List<String> newList = new ArrayList<String>();
		for (String name : namesList) {
			if (name.length() >= 5) {
				newList.add(name);
			}
		}
		return newList;
	}

	public static void main(String[] args) {
		String[] names = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		List<String> namesList = Arrays.asList(names);

		System.out.println("List of Names:" + namesList);

		List<String> processedListOfNames = getProcessedNamesList(namesList);
		System.out.println("New names list: " + processedListOfNames);
	}
}
