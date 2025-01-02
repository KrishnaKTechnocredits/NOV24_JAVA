/*
 * Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};

 */

package mayur;

import java.util.Arrays;

public class Challenge2 {
	boolean checkVowel(String str) {
		boolean flag = false;
		int count = 0;
		str=str.toLowerCase();
		for (int i = 0; i<str.length();i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
				if (count > 1 ) {
					flag = true;
				}
			}
		}
		return flag;
	}
	
	String getReverseString(String str) {
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}
	
	String[] getRevStringArray(String[] arr) {
		//String[] revArr = new String[arr.length];
		for (int i = 0; i < arr.length ; i++) {
			if(checkVowel(arr[i])) {
				arr[i]= getReverseString(arr[i]);
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		Challenge2 obj = new Challenge2();
		System.out.println(Arrays.toString(obj.getRevStringArray(input)));
	}
}
