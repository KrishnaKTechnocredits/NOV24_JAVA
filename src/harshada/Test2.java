/*Challenge - 2: Given an array of strings, reverse each string in the 
 * array only if the string contains more than one vowel (a, e, i, o, u). 
 * The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};*/


package harshada;

import java.util.Arrays;

public class Test2 {
	
	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		Test2 test2=new Test2();
		test2.printReverseStringArrayWithVowels(input);
	}
	
	void printReverseStringArrayWithVowels(String[] input) {
		String[] output=new String[input.length];
		for(int i=0;i<input.length;i++) {
			output[i]=countVowelsInString(input[i]);//calling method to check vowels in given string
		}
		System.out.println(Arrays.toString(output));
	}
	
	String countVowelsInString(String input) {
		int vowelcount = 0;
		String vowelString = "aeiouAEIOU";
		for (int i = 0; i < input.length(); i++) {
			for (int j = 0; j < vowelString.length(); j++) {
				if (input.charAt(i) == vowelString.charAt(j)) {
					vowelcount++;
				}
			}
		}//System.out.println(vowelcount);
		String output="";
		if(vowelcount>0) {
			 output=revString(input);//calling method to reverse string if it has vowels
			 return output;//return string with vowels 
		}
		return input;//return string without vowels
	}

	String revString(String input) {
		String output="";
		for(int i=input.length()-1;i>=0;i--) {
			output+=input.charAt(i);
		}
		//System.out.println(output);
		return output;
	}
}
