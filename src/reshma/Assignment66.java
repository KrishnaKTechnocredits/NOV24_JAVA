package reshma;

import java.util.Arrays;

public class Assignment66 {
	boolean  DigitsInString(String input) {
		boolean flag = false;
		for(int i = 0 ; i<input.length() ; i++) {
			if(Character.isDigit(input.charAt(i))) {
				flag = true;
				break;
			}
		}
		return flag ;
	}
	
	String returnReverseString(String input) {
		String reverseString = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			reverseString += input.charAt(index);
		}
		return reverseString;
	}
	
	String removeDigitsFromString(String input) {
		String  stringname= "";
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (!Character.isDigit(ch))
				stringname += ch;
		}		
		return stringname;
	}
	
	String [] getRevStringArray(String[] input) {
		String[] output = new String[input.length];		
		for (int i =0;i< input.length ; i++) {
			String str = input[i];
			if (DigitsInString(str) == true) {
				output[i] = removeDigitsFromString(str);
			} else {
				output[i] = returnReverseString(str);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		Assignment66 a66=new Assignment66();
		String[] input = {"tech", "aa1shvi", "credits", "H4i", "Hello"};		
		String [] RevStringArray= a66.getRevStringArray(input);
		System.out.println(Arrays.toString(RevStringArray));
		} 	
}
