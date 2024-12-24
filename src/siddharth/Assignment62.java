package siddharth;

import java.util.Arrays;

/*
 Assignment - 62 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array and place at in reverse order.

input : {"tech", "aashvi", "Credits", "Ansh"}
output : [hsnA,stiderC, ivhsaa, hect]
 */

public class Assignment62 {
	
	String getReverseString(String word) {
		String output ="";
		for(int i=word.length()-1;i>=0;i--) {
			char ch = word.charAt(i);
			output += ch;
		}
		return output;
	}
	
	String[] getReverseArray(String[] input) {
		String[] output=new String[input.length];
		for(int i=0, j=input.length-1;i<input.length;i++,j--) {
			output[j]=getReverseString(input[i]);
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment62 assignment62 = new Assignment62();
		String[] input={"tech", "aashvi", "Credits", "Ansh"};
		String[] ans= assignment62.getReverseArray(input);
		System.out.println("Output : "+Arrays.toString(ans));
	}
}
