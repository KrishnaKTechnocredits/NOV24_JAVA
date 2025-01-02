/*
 * Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};

 */
package rohan;

import java.util.Arrays;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Question2 ques = new Question2();
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		String[] Output = ques.RevArray(input);
		System.out.println(Arrays.toString(Output));
	}
	
	String ReverseString(String Str) {
		String word = "";
		for(int i=Str.length()-1; i>=0 ;i--) {
			word += Str.charAt(i);
		}
		return word;
	}

	String[] RevArray(String[] input) {
		String[] Reverse = new String[input.length];
		for(int i=0;i< input.length;i++) {
			if(i%2==0) {
				Reverse[i] = ReverseString(input[i]);
			}else {
			Reverse[i]=input[i];
			}
		}
		return Reverse;
	}

}
