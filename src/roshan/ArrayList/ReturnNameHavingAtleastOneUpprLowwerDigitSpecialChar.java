package roshan.ArrayList;

import java.util.*;

public class ReturnNameHavingAtleastOneUpprLowwerDigitSpecialChar {
	List<String> getNameWithAtleastOneUpprLowwerDigitSpecialChar(String[] arr) {
		List<String> output = new ArrayList<String>(); // Arraysprovide method for manuplatation
		for (int i = 0; i < arr.length; i++) {
			if (getListOfNameHavingDiffChar(arr[i])) {
				output.add(arr[i]);
			}

		}
		return output;
	}

	public boolean getListOfNameHavingDiffChar(String arr) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int spCharCount = 0;
		for (int i = 0; i < arr.length(); i++) {
			char ch = arr.charAt(i);

			if (Character.isUpperCase(ch)) {
				uCount++;
			} else if (Character.isLowerCase(ch)) {
				lCount++;
			} else if (Character.isDigit(ch)) {
				dCount++;
			} else if (ch == '_' || ch == '!' || ch == '#' || ch == '$') {
				spCharCount++;
			}

		}
		return uCount > 0 && lCount > 0 && dCount > 0 && spCharCount > 0;

	}

	public static void main(String[] args) {
		String[] arr = { "TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!i1ksHa", "PUNE1#" };
		ReturnNameHavingAtleastOneUpprLowwerDigitSpecialChar obj1 = new ReturnNameHavingAtleastOneUpprLowwerDigitSpecialChar();
		List<String> result = obj1.getNameWithAtleastOneUpprLowwerDigitSpecialChar(arr);
		System.out.println(result);

	}

}

/*
 * Assignment - 76 : 11th Jan return the list of names having atleast one
 * uppercase, one lowercase, one digit and one special character (_, !, #, $) in
 * the name.
 * 
 * String[] arr = {"TechnOCrediTs", "TEch1n_o##", "Credits", "Tit!iksHa",
 * "PUNE1#"}; output : {"TEch1n_o##", "Tit!iksHa"}
 */