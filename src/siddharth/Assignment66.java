package siddharth;

import java.util.Arrays;

/*
 Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]
 */

public class Assignment66 {
	
	String getReverseWord(String word) {
		String output="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch=word.charAt(i);
			output += ch;
		}
		return output;
	}

	String getWordWithoutDigit(String word) {
		String output="";
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(!Character.isDigit(ch)) {
				output += ch;
			}
		}
		return output;
	}
	
	Boolean checkIfWordHasDigit(String word) {
		Boolean flag=false;
		for(int i=0;i<word.length();i++) {
			char ch=word.charAt(i);
			if(Character.isDigit(ch)) {
				flag=true;
			}
		}
		return flag;
	}
	
	String[] getArray(String[] input) {
		String[] output=new String[input.length];
			for(int i=0;i<input.length;i++) {
				String word=input[i];
				if(checkIfWordHasDigit(word)) {
					output[i]=getWordWithoutDigit(word);
				}else{
					output[i]=getReverseWord(word);
				}
			}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment66 assignment66 = new Assignment66();
		String[] input={"tech", "aa1shvi", "credits", "H4i", "Hello"};
		String[] ans=assignment66.getArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
