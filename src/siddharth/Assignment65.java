package siddharth;

import java.util.Arrays;

/*
Assignment - 65 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order.

input : {"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"}
output : [HSNa,StidErc, IvHsaa, HCet]

Hint : First letter in Uppercase + last Letter in lowercase + all other characters in same case + exclude digits
 */

public class Assignment65 {
	
	String getReverseWord(String word) {
		String output ="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch = word.charAt(i);
			output += ch;
		}
		return output;
	}
	
	String getWordUpperLowercase(String word) {
		String output=word.substring(0,1).toUpperCase()+word.substring(1,word.length()-1)+word.substring(word.length()-1,word.length()).toLowerCase();
		return output;
	}
	
	String getWordWithoutDigits(String word) {
		String output="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
				if(!Character.isDigit(ch)) {
					output += ch;
				}
		}
		return output;
	}
	
	String[] getReverseArray(String[] input) {
		String word="";
		String[] output = new String[input.length];
		for(int i=0,j=input.length-1;i<input.length;i++,j--) {
			word=input[i];
			word=getReverseWord(word);
			word=getWordUpperLowercase(word);
			word=getWordWithoutDigits(word);
			output[j]=word;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		String[] input={"Te1Ch", "A2as3Hvi", "CrE45di555ts", "ANSH"};
		String[] ans = assignment65.getReverseArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
