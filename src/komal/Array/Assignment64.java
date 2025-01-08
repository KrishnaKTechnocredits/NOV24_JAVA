//Assignment - 64 : 22nd Dec'2024 [20 min]
//reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.
//
//input : {"Tech", "Aashvi", "Credits", "Ansh"}
//output : [Hsna,Stiderc, Ivhsaa, Hcet]

package komal.Array;

import java.util.Arrays;

public class Assignment64 {
	String getReverseWord(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output = output + str.charAt(i);
		}
		return output.toLowerCase();

	}

	String getFirstLetterUpperCase(String str) {
//logic 1:
//		char word = Character.toUpperCase(str.charAt(0));
//		str = word + str.substring(1);
//		return str;

		// logic 2
		return str.substring(0, 1).toUpperCase().substring(1);
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = 0, j = input.length - 1; i < input.length; i++, j--) {
			String str = getReverseWord(input[i]);
			String updateStr = getFirstLetterUpperCase(str);

			output[j] = updateStr;
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		Assignment64 a64 = new Assignment64();
		String[] output = a64.getReverseArray(input);
		System.out.println(Arrays.toString(output));
	}

}
