package Assignment_Array;

import java.util.Arrays;

public class Assignment66 {
	
	boolean getDigitStatus(String str) {
		boolean flag = false;
		for(int i =0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				flag = true;
			}
		}
		return flag;
	}
	
	String getStringWithoutDigit(String str) {
		String strWD = "";
		for(int i = 0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) {
				strWD += str.charAt(i);
			}
		}
		return strWD;
	}
	
	String getReverseStringWithoutDigit(String str) {
		String revStr = "";
		for(int i = str.length()-1;i>=0;i--) {
			if(Character.isLetter(str.charAt(i))) {
				revStr += str.charAt(i);
			}
		}
		return revStr;
	}
	
	String[] getArrayWithoutDigit(String[] str) {
		String[] output = new String[str.length];
		boolean flag = false;
		for(int i = 0;i<str.length;i++) {
			flag = getDigitStatus(str[i]);
			if(flag == true) {
				output[i] = getStringWithoutDigit(str[i]);
			}else
				output[i] = getReverseStringWithoutDigit(str[i]);
		}
		return output;
	}
	public static void main(String[] args) {
		String[] str = {"tech", "aa1shvi", "credits", "H4i", "Hello"};
		String[] output = new Assignment66().getArrayWithoutDigit(str);
		System.out.println(Arrays.toString(output));
		
	}
}
