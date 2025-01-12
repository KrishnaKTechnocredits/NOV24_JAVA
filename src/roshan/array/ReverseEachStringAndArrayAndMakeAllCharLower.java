package roshan.array;

import java.util.Arrays;

public class ReverseEachStringAndArrayAndMakeAllCharLower {
	String reverseString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) { // made mistake while initlizing loop use grater than equal to
														// care fully
			str += input.charAt(i);

		}
		return str;

	}

	String getlowerCase(String input) {
		String lowerCase = reverseString(input).toLowerCase();
		return lowerCase;
	}

	String[] getReverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = getlowerCase(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "TeCh", "Aashvi", "Credits", "AnsH" };
		ReverseEachStringAndArrayAndMakeAllCharLower reverseeacstringandarrayandmakeallcharlower = new ReverseEachStringAndArrayAndMakeAllCharLower();
		String[] result = reverseeacstringandarrayandmakeallcharlower.getReverseArray(input);
		System.out.println(Arrays.toString(result));
	}

}



/*
 * Assignment - 63 : 22nd Dec'2024 [20 min] [IMP] reverse each string in array
 * and place at in reverse order.all character should be in lowecase
 * 
 * input : {"TeCh", "Aashvi", "Credits", "AnsH"} output : [hsna,stiderC, ivhsaa,
 * hcet]
 */
