/*
 * Assignment - 61 : 22nd Dec'2024 [20 min] [IMP]
reverse each string in array at the same place.

input : {"tech", "aashvi", "credits"}
output : [hcet, ivhsaa, stiderc]
 */


package rohan;

import java.util.Arrays;

public class Assignment_61 {

	public static void main(String[] args) {
		String [] input = {"tech", "aashvi", "credits"};
		Assignment_61 assignment = new Assignment_61();
		String[] str = assignment.ReverseArray(input);
		System.out.println(Arrays.toString(str));
		
	}
	String ReverseString(String input) {
		String str = " ";
		for(int i = input.length()-1;i>=0;i--) {
			str += input.charAt(i);	
		}		
		return str;
	}
	String[] ReverseArray(String[] input) {
		String[] Output = new String[input.length];
		for(int i=0;i<input.length;i++) {
			Output[i]=ReverseString(input[i]);
		}
		return Output;
	}
}
