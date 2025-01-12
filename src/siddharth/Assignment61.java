package siddharth;

import java.util.Arrays;

/*
Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
 */

public class Assignment61 {
	String getReverse(String word) {
		String output="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch = word.charAt(i);
				output=output+ch;
		}
		return output;
	}
	
	String[] getRevWordInArray(String[] input) {
		String[] output = new String[input.length];
		for(int i=0;i<input.length;i++) {
			String word=input[i];
			output[i]=getReverse(word);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment61 assignment61 = new Assignment61();
		String []input={"tech", "aashvi", "credits"};
		String[] ans=assignment61.getRevWordInArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
		
	}
}
