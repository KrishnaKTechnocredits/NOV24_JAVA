/*
Assignment - 76 : 11th Jan
return the list of names having atleast one uppercase, one lowercase, one digit and one special character (_, !, #, $) in the name.

String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa1", "PUNE1#"};
output : {"TEch1n_o##", "Tit!iksHa"}
*/

package pramod.collection;

import java.util.*;

class Assignment76 {

	boolean getStringSorted(String str) {
		int countU = 0;
		int countL = 0;
		int countD = 0;
		int countS = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				countU = 1;
			} else if (Character.isLowerCase(ch)) {
				countL = 1;
			} else if (Character.isDigit(ch)) {
				countD = 1;
			} else if (ch == '_' || ch == '!' || ch == '#' || ch == '$') {
				countS = 1;
			}
		}
		int total = countU + countD + countL + countS;
		if (total == 4) {
			return true;
		}
		return false;
	}

	ArrayList<String> getListOfNames(String[] arr) {
		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < arr.length; i++) {
			boolean flag = getStringSorted(arr[i]);
			if (flag) {
				al.add(arr[i]);
			}
		}
		return al;
	}

	public static void main(String[] args) {
		Assignment76 A76 = new Assignment76();
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa1", "PUNE1#" };
		System.out.println("Given sting is :" + Arrays.toString(arr));
		ArrayList ans = A76.getListOfNames(arr);
		System.out.println("List of Names which has Uppercase, Lowercase, Digit, Special Characters are: " + ans);
	}
}