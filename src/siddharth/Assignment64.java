package siddharth;

import java.util.Arrays;

/*
 Assignment - 64 : 22nd Dec'2024 [20 min]
reverse each string in array and place at in reverse order, each word first letter capital and rest in lowercase.

input : {"Tech", "Aashvi", "Credits", "Ansh"}
output : [Hsna,Stiderc, Ivhsaa, Hcet]
 */

public class Assignment64 {
	
	String getReverseWord(String word) {
		String output="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch = word.charAt(i);
			output += ch;
		}
		return output;
	}
	
	String getWordFirstLetterCapitalRestLowercase(String word) {
		String output = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
		return output;
	}
	
	String[] getReverseArray(String[] input) {
		String word="";
		String[] output = new String[input.length];
		for(int i=0, j=input.length-1;i<input.length;i++,j--) {
			word=getReverseWord(input[i]);
			word=getWordFirstLetterCapitalRestLowercase(word);
			output[j]=word;
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment64 assignment64 = new Assignment64();
		String[] input={"Tech", "Aashvi", "Credits", "Ansh"};
		String[] ans = assignment64.getReverseArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
