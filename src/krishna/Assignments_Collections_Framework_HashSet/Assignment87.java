package Assignments_Collections_Framework_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Assignment87 {

	Set<String> getStringWithVowels(Set<String> set) {
		Set<String> setOfNames = new HashSet<String>();
		ArrayList<String> listOfNames = new ArrayList<String>(set);

		for (int i = 0; i < listOfNames.size(); i++) {
			if (listOfNames.get(i).charAt(listOfNames.get(i).length() - 1) == 'a'
					|| listOfNames.get(i).charAt(listOfNames.get(i).length() - 1) == 'e'
					|| listOfNames.get(i).charAt(listOfNames.get(i).length() - 1) == 'i'
					|| listOfNames.get(i).charAt(listOfNames.get(i).length() - 1) == 'o'
					|| listOfNames.get(i).charAt(listOfNames.get(i).length() - 1) == 'u') {
				setOfNames.add(listOfNames.get(i));
			}
		}

		return setOfNames;
	}

	public static void main(String[] args) {
		Assignment87 assignment87 = new Assignment87();
		HashSet<String> setOfNames = new HashSet<String>();
		setOfNames.add("techno");
		setOfNames.add("credits");
		setOfNames.add("rushikesh");
		setOfNames.add("krishna");

		System.out.println(assignment87.getStringWithVowels(setOfNames));

	}
}
