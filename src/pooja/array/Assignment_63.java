package pooja.array;

import java.util.Arrays;

/*Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]
*/
public class Assignment_63 {

	String getReversedWord(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word = word + str.charAt(i);
		}
		return word;
	}

	String[] getReversedStringArray(String[] arr) {
		String[] revArr = new String[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			revArr[i] = getReversedWord(arr[i]);
		}
		return revArr;
	}

	String[] getStringInReverseWithAllLowerCaseLetter(String[] input) {
		String[] lowercase = new String[input.length];
		String[] temp = new String[input.length];
		for (int i = 0; i < input.length; i++) {
			temp = getReversedStringArray(input);
			lowercase[i] = temp[i].substring(0).toLowerCase();
		}
		return lowercase;
	}

	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		Assignment_63 assignment_63 = new Assignment_63();
		System.out.println("The given array is : " + Arrays.toString(input));
		String[] ans = assignment_63.getStringInReverseWithAllLowerCaseLetter(input);
		System.out.println("The reversed array with first letters in lowercase is : " + Arrays.toString(ans));
	}
}