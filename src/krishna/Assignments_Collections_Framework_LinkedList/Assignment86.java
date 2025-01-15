package Assignments_Collections_Framework_LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Assignment86 {

	List<String> getNewList(String[] str) {
		List<String> listOfNames = new LinkedList<String>(Arrays.asList(str));

		Iterator<String> itr = listOfNames.iterator();

		while (itr.hasNext()) {
			if (itr.next().length() <= 5) {
				itr.remove();
			}
		}

		return listOfNames;
	}

	public static void main(String[] args) {
		Assignment86 assignment86 = new Assignment86();
		String[] str = { "Aaruhi", "Ansh", "Akanksha", "Eva", "Kishor" };
		System.out.println(assignment86.getNewList(str));
	}
}
