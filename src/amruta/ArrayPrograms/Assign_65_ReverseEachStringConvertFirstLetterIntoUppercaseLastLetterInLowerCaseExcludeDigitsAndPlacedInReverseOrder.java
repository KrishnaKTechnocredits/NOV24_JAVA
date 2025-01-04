/*
 * Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits
 */
package amruta.ArrayPrograms;

import java.util.Arrays;

public class Assign_65_ReverseEachStringConvertFirstLetterIntoUppercaseLastLetterInLowerCaseExcludeDigitsAndPlacedInReverseOrder {

	String returnReverseString(String str) {
		String reverseString = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			reverseString += str.charAt(index);
		}
		return reverseString;
	}

	// Optimized - Logic 2
	String converFirstLetterToUppercaseAndLastLetterToLowercase2(String str) {
		str = returnReverseString(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1)
				+ str.substring(str.length() - 1, str.length()).toLowerCase();
		return str;
	}

	// Logic - 1
	String converFirstLetterToUppercaseAndLastLetterToLowercase1(String str) {
		str = returnReverseString(str);

		String str1 = str.substring(0, 1);
		str1 = str1.toUpperCase();

		String str2 = str.substring(1, str.length() - 1);

		String str3 = str.substring(str.length() - 1, str.length());
		str3 = str3.toLowerCase();

		str = str1 + str2 + str3;
		return str;
	}

	String removeDigitsFromString(String str) {
		String input = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch))
				input += ch;
		}
		input = converFirstLetterToUppercaseAndLastLetterToLowercase1(input);
		return input;
	}

	void takeArray(String[] arr) {
		String[] op = new String[arr.length];
		int count = 0;
		for (int index = arr.length - 1; index >= 0; index--) {
			op[count] = removeDigitsFromString(arr[index]);
			count++;
		}
		System.out.println(
				"Array after reversing string and converting first letter uppercase and last letter to lowercase and placed in reverse order ---> \n"
						+ Arrays.toString(op));
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("Given Array --> " + Arrays.toString(input));
		System.out.println("------------------------------------------------");
		new Assign_65_ReverseEachStringConvertFirstLetterIntoUppercaseLastLetterInLowerCaseExcludeDigitsAndPlacedInReverseOrder()
				.takeArray(input);
	}
}
