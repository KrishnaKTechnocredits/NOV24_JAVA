package roshan.ArrayList;

import java.util.Arrays;
import java.util.*;

public class RemoveNameHaving5orLessChar {
	List<String> getNameHavingLessthan5char(String[] Names) {
		List<String> orignalList = new ArrayList<>(Arrays.asList(Names));
		for (int i = 0; i < orignalList.size(); i++) {
			String element = orignalList.get(i);
			if (element.length() <= 5) {
				orignalList.remove(element);
				i--; // this should be added after element removed because position of other element
						// -1 towars upper side and as for that index loop is already run so to treat
						// that element i--

			}

		}

		return orignalList;
	}

	public static void main(String[] args) {
		String[] names = { "Aaruhi", "Ansh", "lala", "Akanksha", "Eva", "Kishor" };
		RemoveNameHaving5orLessChar removenamehaving5orlessChar = new RemoveNameHaving5orLessChar();
		List<String> output = removenamehaving5orlessChar.getNameHavingLessthan5char(names);
		System.out.println(output);
	}
}

/*
 * Assignment - 86: 14th Jan
 * 
 * Remove all the names from list having length less than or equal to 5
 * characters.
 * 
 * input : ["Aaruhi","Ansh", "Akanksha", "Eva", "Kishor"] output : ["Aaruhi",
 * "Akanksha", "Kishor"]
 */