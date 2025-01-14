package rushikesh.ListOfCollection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Assignment_86 {

	void printListOfStringHavingLessThanChar5(String[] arr) {
		List<String> originalList = new ArrayList<String>(Arrays.asList(arr));
		for (int index = 0; index < originalList.size(); index++) {
			String str = originalList.get(index);
			if (str.length() <= 5) {
				originalList.remove(str);
				index--;
			}
		}
		System.out.println(originalList);
	}

	public static void main(String[] args) {
		Assignment_86 assignment_86 = new Assignment_86();
		String[] arr = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		assignment_86.printListOfStringHavingLessThanChar5(arr);
	}
}
