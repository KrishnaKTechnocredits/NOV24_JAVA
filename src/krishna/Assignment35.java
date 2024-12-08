package krishna;

import java.util.Scanner;

public class Assignment35 {

	int getCharFreq(String str , char ch) {
		int charCount = 0;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)== ch) {
				charCount++;
			}
		}
		return charCount;
	}
	
	int getUpperCaseCharFreq(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))== i) {
				if(Character.isUpperCase(str.charAt(i))) {
					return getCharFreq(str, str.charAt(i));
				}
			}
		}
		return 0;
	}
	
	int getLowerCaseCharFreq(String str) {
		for(int i = 0;i<str.length();i++) {
			if(str.indexOf(str.charAt(i))== i) {
				if(Character.isLowerCase(str.charAt(i))) {
					return getCharFreq(str, str.charAt(i));
				}
			}
		}
		return 0;
	}
	
	String getDifference(String str) {
		if(getUpperCaseCharFreq(str)> getLowerCaseCharFreq(str)) {
			return "upper";
		}else if(getUpperCaseCharFreq(str)< getLowerCaseCharFreq(str))
			return "lower";
		else
			return "same";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String str = sc.nextLine();
		
		System.out.println(new Assignment35().getDifference(str));
	}
}
