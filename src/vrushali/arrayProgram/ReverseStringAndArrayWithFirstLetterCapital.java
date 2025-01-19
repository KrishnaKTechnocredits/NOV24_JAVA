package vrushali.arrayProgram;
//Assignment - 64 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.
//
//input : {"Tech", "Aashvi", "Credits", "Ansh"}
//output : [Hsna,Stiderc, Ivhsaa, Hcet]

import java.util.Arrays;

public class ReverseStringAndArrayWithFirstLetterCapital {

	String reverseString(String str) {
		String reverseStr = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + str.charAt(i);
		}
		return reverseStr;
	}

	String[] reverseStringArray(String[] strArray) {
		String[] reverseArray = new String[strArray.length];
		for (int j = strArray.length - 1, i = 0; j >= 0; j--, i++) {
			reverseArray[i] = strArray[j];
		}
		return reverseArray;
	}

	String[] stringArrayWithFirstLetterCapital(String[] strArray) {
		String[] tempArray = new String[strArray.length];
		String word = "", tempStr = "";
		for (int i = 0; i < strArray.length; i++) {
			tempStr = strArray[i].toLowerCase();
			word = Character.toUpperCase(tempStr.charAt(0)) + tempStr.substring(1);
			tempArray[i] = word;
		}
		return tempArray;
	}

	void reverseStringAndArrayWithFirstLetterCapital(String[] str) {
		String[] tempArray = new String[str.length];
		for (int i = 0; i < str.length; i++) {

			tempArray[i] = reverseString(str[i]);
		}

		String[] reverseStringArray = reverseStringArray(tempArray);
		System.out.println("Original String Array :--" + Arrays.toString(str));
		System.out.println("Reverse String Array :--" + Arrays.toString(reverseStringArray));

		String[] lowerCaseArray = stringArrayWithFirstLetterCapital(reverseStringArray);
		System.out.println("Array with all letter with First letter capital and other lower case :--"
				+ Arrays.toString(lowerCaseArray));
	}

	public static void main(String[] args) {
		ReverseStringAndArrayWithFirstLetterCapital reverseStringAndArrayWithFirstLetterCapital = new ReverseStringAndArrayWithFirstLetterCapital();
		String[] str = { "tech", "aashvi", "Credits", "Ansh" };
		reverseStringAndArrayWithFirstLetterCapital.reverseStringAndArrayWithFirstLetterCapital(str);
	}
}
