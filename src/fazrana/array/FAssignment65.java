//Assignment - 65 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order.
//
//input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
//output : [HSNa,StidErc, IvHsaa, HCet]
//
//Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits

package fazrana.array;

import java.util.Arrays;

public class FAssignment65 {
	String getReverseSring(String str) {
		String revString = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revString += str.charAt(i);
		}
		return revString;
	}

	String getUpperLowerString(String str) {
		String revString = str.substring(0, 1).toUpperCase() + str.substring(1, str.length() - 1)
				+ str.substring(str.length() - 1).toLowerCase();
		return revString;
	}

	String removeDigit(String str) {
		String revString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isDigit(ch)) {
				revString += str.charAt(i);
			}
		}
		return revString;
	}

	String getRevArray(String[] array) {
		String[] output = new String[array.length];
		for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
			output[j] = getReverseSring(array[i]);
			output[j] = getUpperLowerString(output[j]);
			output[j] = removeDigit(output[j]);
		}
		return Arrays.toString(output);
	}

	public static void main(String[] args) {
		String[] input = { "Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH" };
		System.out.println("Input Array:" + Arrays.toString(input));
		FAssignment65 fassignment65 = new FAssignment65();
		System.out.println("Output Array:" + fassignment65.getRevArray(input));
	}
}
