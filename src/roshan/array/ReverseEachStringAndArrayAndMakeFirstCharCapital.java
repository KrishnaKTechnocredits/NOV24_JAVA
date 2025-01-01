package roshan.array;

import java.util.Arrays;

public class ReverseEachStringAndArrayAndMakeFirstCharCapital {

	String getreverseString(String input) {
		String str = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			str += input.charAt(i); // declaere properly dont add i after input

		}
		return str;
	}

	String MakeFirstCharCapitalOfReverseString(String input) {
		String str = getreverseString(input);
		String firstCaps = str.substring(0, 1).toUpperCase();
		String Lastchar = str.substring(input.length()-1).toLowerCase();
		return str = firstCaps + str.substring(1,input.length()-1)+ Lastchar; //uese lenth -1 carefully

	}

	String[] reverseArray(String[] input) {
		String[] output = new String[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = MakeFirstCharCapitalOfReverseString(input[i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] input = { "Tech", "Aashvi", "Credits", "Ansh" };
		ReverseEachStringAndArrayAndMakeFirstCharCapital MakeFirstCharCapital = new ReverseEachStringAndArrayAndMakeFirstCharCapital();
		String[] result = MakeFirstCharCapital.reverseArray(input);
		System.out.println(Arrays.toString(result));
	}

}

/*
 * Assignment - 64 : 22nd Dec'2024 [20 min] reverse each string in array and
 * place at in reverse order, each word first letter should be capital and rest
 * in lowercase.
 * 
 * input : {"Tech", "Aashvi", "Credits", "Ansh"} output : [Hsna,Stiderc, Ivhsaa,
 * Hcet]
 */