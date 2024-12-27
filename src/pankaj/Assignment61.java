package pankaj;

import java.util.*;

public class Assignment61 {

	String getStringRev(String str) {
		String word = " ";
		char ch;
		for (int index = str.length() - 1; index >= 0; index--) {

			ch = str.charAt(index);
			word = word + ch;

		}

		return word;
	}

	String[] getArray(String[] arr) {
		String[] str = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			str[index] = getStringRev(arr[index]);
		}
		return str;

	}

	public static void main(String[] args) {
		String[] arr = { "tech", "aashvi", "credits" };
		Assignment61 A = new Assignment61();
		String[] s = A.getArray(arr);
		System.out.println("Given String     :: " + Arrays.toString(arr));
		System.out.println("Resultings String:: " + Arrays.toString(s));

	}

}
