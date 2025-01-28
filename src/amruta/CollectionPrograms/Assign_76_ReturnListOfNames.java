/*
Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"}
*/
package amruta.CollectionPrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class Assign_76_ReturnListOfNames {

	boolean returnName(String name) {
		int uppercaseCount = 0;
		int lowercaseCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;

		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isUpperCase(ch)) {
				uppercaseCount++;
			} else if (Character.isLowerCase(ch)) {
				lowercaseCount++;
			} else if (Character.isDigit(ch)) {
				digitCount++;
			} else {
				specialCharCount++;
			}
		}

		if (uppercaseCount > 0 && lowercaseCount > 0 && digitCount > 0 && specialCharCount > 0)
			return true;
		else
			return false;
	}

	ArrayList<String> takeArrayOfNames(String[] arr) {
		ArrayList<String> list = new ArrayList<String>();
		for (int index = 0; index < arr.length; index++) {
			boolean flag = returnName(arr[index]);
			if (flag)
				list.add(arr[index]);
		}
		return list;
	}

	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa9", "PUNE1#" };
		System.out.println("Original List - " + Arrays.toString(arr) + "\n");
		ArrayList<String> list = new Assign_76_ReturnListOfNames().takeArrayOfNames(arr);
		System.out.println(
				"List of names having atleast one uppercase, one lowercase, one digit and one special character : \n");
		System.out.println(list);
	}
}