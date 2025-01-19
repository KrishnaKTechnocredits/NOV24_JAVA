package Assignment_Array;

import java.util.Arrays;

public class Assignment62 {
	
	String reverseString(String str) {
		String revStr = ""; 
		for(int i  = str.length()-1;i>=0;i--) {
			revStr += str.charAt(i);
		}
		return revStr;
	}
	
	String[] getReverseString(String[] str) {
		String[] output  = new String[str.length];
		for(int i = str.length-1;i>=0;i--) {
			output[i] = reverseString(str[str.length-1-i]);
		}
		return output;
	}

	public static void main(String[] args) {
		String[] str = {"tech", "aashvi", "Credits", "Ansh"};
		String[] arr = new Assignment62().getReverseString(str);
		System.out.println(Arrays.toString(arr));
	}
}
