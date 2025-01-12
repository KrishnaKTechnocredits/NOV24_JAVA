/*Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:

Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};*/

package sindhu.Array;

import java.util.Arrays;

public class Test2 {
	
	String getReverseString(String str1) {
		String revStr = "";
		for(int i=str1.length()-1; i>=0;i--) {
			char ch = str1.charAt(i);
			revStr = revStr+ch;
		}
		return revStr;
	}
	
	String isVowelsMoreThan1(String str1) {
		char[] vowels = {'a','e','o','i','u'};
		int count = 0;
		for(int j=0;j<str1.length();j++) {
			char ch = str1.charAt(j);
			for(int k=0; k<vowels.length;k++) {
				if(ch==vowels[k]) {
					count++;
				}
			}
			if(count>1){
				return getReverseString(str1);
			}
		}
		return str1;
	}
	
	String[] callRevStringArray(String[] input) {
		String[] output = new String[input.length];
		
		for(int i=0; i<input.length; i++) {
			output[i] = isVowelsMoreThan1(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		Test2 test2 = new Test2();
		System.out.println("Input array is: "+Arrays.toString(input));
		String[] output = test2.callRevStringArray(input);
		System.out.println("Output Array is:"+Arrays.toString(output));
	}
}
