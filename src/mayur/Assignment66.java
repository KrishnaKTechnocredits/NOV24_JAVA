/*
 * Assignment - 66 : 22nd Dec'2024 [20 min]
reverse word in array at the same place provided word should not have any digit, if word is having any digit do not reverse the word.

input : {"tech", "aa1shvi", "credits", "H4i", "Hello"}
output : [hcet, aashvi, stiderc, Hi, olleH]

 */

package mayur;

import java.util.Arrays;

public class Assignment66 {
	
	boolean verifyDigitIsAbsent(String str) {
		boolean flag=true;
		for (int i =0 ; i < str.length();i++) {
			if (Character.isDigit(str.charAt(i))) {
				flag = false;
			}
		}
		return flag;
	}
	
	String[] getReversedStringElements(String[] input) {
		String[] str = new String[input.length];
		for (int i =0 ; i<input.length;i++) {
			if (verifyDigitIsAbsent(input[i])) {
				String revTemp = "";
				String temp = input[i];
				for (int index = temp.length()-1; index >= 0; index--) {
					revTemp = revTemp + temp.charAt(index);
				}
				str[i]=revTemp;
			}else {
				String tempNoDigit = "";
				String temp = input[i];
				for (int index = 0; index < temp.length(); index++) {
					if (Character.isLetter(temp.charAt(index))) {
						tempNoDigit = tempNoDigit + temp.charAt(index);
					}					
				}
				str[i]=tempNoDigit;
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		String[] input = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		Assignment66 obj = new Assignment66();
		String[] revInput = obj.getReversedStringElements(input);
		System.out.println(Arrays.toString(revInput));
	}
}
