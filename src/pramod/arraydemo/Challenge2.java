/*
Challenge - 2: Given an array of strings, reverse each string in the array only if the string contains more than one vowel (a, e, i, o, u). The resulting array should reflect the modifications.

Example:
Input:
String[] input = {"apple", "sky", "orange", "try", "eagle"};
Output:
String[] output = {"elppa", "sky", "egnaro", "try", "elgae"};
*/
package pramod.arraydemo;
import java.util.*;
class Challenge2 {

	String getReverseString(String str){
		String output="";
		int count=0;
		for(int i=str.length()-1; i>=0 ; i--){
			char ch = str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				count++;
			}
			if(count>=2){
				for(int j=str.length()-1; j>=0 ; j--){
					char ch1 = str.charAt(j);
					output =output+ ch1;
				}
				break;
			}
		}
		if(count<=1) {
			return str;
		}
		return output;
	}
	
	void printEachStringReverseIfMoreThanTwoVowels(String[] input){
		String[] output = new String[input.length];
		for(int i= 0 ; i<input.length;i++){
			output[i] = getReverseString(input[i]);
		}
		System.out.println("Reversed String if it has more than one vowel :"+ Arrays.toString(output));
	}

	public static void main(String[] args){
		Challenge2 ch2 = new Challenge2();
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		System.out.println("Given string array :"+ Arrays.toString(input));
		ch2.printEachStringReverseIfMoreThanTwoVowels(input);
	}
}