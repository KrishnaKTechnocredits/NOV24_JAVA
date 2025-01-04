package pooja.array;

import java.util.Arrays;

/*Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order with first letter in uppercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
*/
public class Assignment_64 {

	String getReverseWord(String str) {
		String word = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			word = word + str.charAt(i);
		}
		return word;
	}

	String[] getReverseStringWithFirstLetterInUppercase(String[] input) {
		String[] arr = new String[input.length];
		String[] arr2 = new String[input.length];
		int cnt = 0;
		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[cnt] = getReverseWord(input[i]);
			cnt++;
		}
		return arr2;
	}

	String[] getFirstletterinUppercase(String[] arr2) {
		String[] upperCaseString = new String[arr2.length];
		String[] temp = new String[arr2.length];
		for (int i = 0; i < arr2.length; i++) {
			temp = getReverseStringWithFirstLetterInUppercase(arr2);
			upperCaseString[i] = temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1).toLowerCase();
		}
		return upperCaseString;
	}

	public static void main(String[] args) {
		String[] input = {"TeCh", "Aashvi", "Credits", "AnsH"};
		Assignment_64 assignment_64 = new Assignment_64();
		System.out.println("The given String array is : " + Arrays.toString(input));
		String[] ans = assignment_64.getFirstletterinUppercase(input);
		System.out.println("The reversed array with first letter in upeercase is : " + Arrays.toString(ans));
	}
}