//Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains 
//more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.
//
//Example:
//Input:
//String[] input = {"apple", "sky", "orange", "try", "eagle"};
//Output:
//String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};

package fazrana.array;

import java.util.Arrays;

public class Challenge2 {
	boolean getVowel(String str) {
		boolean output=false;
		int count=0;
		for (int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a'||str.charAt(i)=='e' ||str.charAt(i)=='i'|| str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count++;
				if(count>1) {
					output=true;
					break;
				}else {
					output=false;
				}
			}
		}
		return output;
	}
	
	String revArray(String str) {
		String output="";
		for (int i=0;i<str.length();i++) {
			output= output+ str.charAt((str.length()-1)-i);
		}
		return output;
	}
	
	String[] revArray(String[] array) {
		String[] output= new String[array.length];
		for (int i=0;i<array.length;i++) {
			if(getVowel(array[i])){
				output[i]=revArray(array[i]);
			}else {
				output[i]=array[i];
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		System.out.println("Input array: "+Arrays.toString(input));
		Challenge2 challenge2=new Challenge2();
//		System.out.println(challenge2.getVowel("apple"));
//		System.out.println(challenge2.revArray("apple"));
		System.out.println("Output Array: "+Arrays.toString(challenge2.revArray(input)));
	}
}
