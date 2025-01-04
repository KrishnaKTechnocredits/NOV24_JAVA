package kishor;

import java.util.Arrays;

//reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.
//
//input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
//output : [hcet, aashvi, stiderc, Hi, olleH]

public class Assignment66_RevStringSameArrayCombo {

	boolean isWordHavingDigit(String input) {
		boolean flag = false;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isDigit(ch)) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	String getRevString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			char ch = input.charAt(i);
			str = str + ch;
		}
		return str;
	}

	String getExcludingDigit(String str) {
		String st = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				st = st + ch;
			}
		}
		return st;
	}

	String[] getRevStringArray(String[] input) {
		String[] obj = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			String str = input[i];
			if (isWordHavingDigit(str) == true) {
				obj[i] = getExcludingDigit(str);
			} else {
				obj[i] = getRevString(str);
			}
		}
		return obj;
	}

	public static void main(String[] args) {
		String[] input = { "tech", "aa1shvi", "credits", "H4i", "Hello" };
		Assignment66_RevStringSameArrayCombo assignment66 = new Assignment66_RevStringSameArrayCombo();
		String[] ans = assignment66.getRevStringArray(input);
		System.out.println(Arrays.toString(ans));
	}
}
