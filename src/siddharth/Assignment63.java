package siddharth;

import java.util.Arrays;

/*
 Assignment - 63 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order & all words in Lowercase

input : {"TeCh", "Aashvi", "Credits", "AnsH"}
output : [hsna,stiderc, ivhsaa, hcet]
 */

public class Assignment63 {
	
	String getReverseOrderOfWord(String word) {
		String output="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch=word.charAt(i);
			output += ch;
		}
		return output;
		
	}
	
	String[] getReverseArray(String[] input) {
		String word="";
		String[] output=new String[input.length];
		for(int i=0,j=input.length-1;i<input.length;i++,j--) {
			word=input[i];
			output[j]=getReverseOrderOfWord(word.toLowerCase());
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment63 assignment63 = new Assignment63();
		String[] input={"TeCh", "Aashvi", "Credits", "AnsH"};
		String[] ans=assignment63.getReverseArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}

}
