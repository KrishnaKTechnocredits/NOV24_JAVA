/*
 * Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"}

 */

package rohan;

import java.util.*;

public class Assignment_76 {

	public static void main(String[] args) {
		Assignment_76 assignment = new Assignment_76();
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa", "pPUNE1#" };
		ArrayList<String> Output = assignment.ReturnNames(arr);
		System.out.println("Output : " + Output);

		// String[] OutputArray = assignment.ReturnSpecialName(arr);
		// System.out.println(Arrays.toString(OutputArray));

	}

	// Using ArrayList
	ArrayList<String> ReturnNames(String[] arr) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			if (ContainSpecialChar(arr[i]) && ContainLowerCase(arr[i]) && ConatinUpperCase(arr[i])) {
				al.add(arr[i]);
			}
		}
		return al;
	}

	// Without using Arraylist
	String[] ReturnSpecialName(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ContainSpecialChar(arr[i]) && ContainLowerCase(arr[i]) && ConatinUpperCase(arr[i])) {
				count++;
			}
		}
		String[] NameString = new String[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (ContainSpecialChar(arr[i]) && ContainLowerCase(arr[i]) && ConatinUpperCase(arr[i])) {
				NameString[index++] = arr[i];
			}
		}
		return NameString;
	}

	// Calling Methods
	boolean ContainSpecialChar(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	boolean ContainLowerCase(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLowerCase(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	boolean ConatinUpperCase(String str) {
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

}
