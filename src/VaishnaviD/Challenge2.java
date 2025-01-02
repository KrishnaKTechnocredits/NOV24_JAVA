package VaishnaviD;

import java.util.Arrays;

public class Challenge2 {
	
	boolean checkVowel(String str) {
		boolean flag = false;
		str=str.toLowerCase();
		for (int i = 0; i<str.length();i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
					flag = true;
				}
			}
		}
		return flag;
	}

	String getReverseString(String str) {
		String rev = "";
		for (int i = str.length()-1; i >=0; i--) {
			rev = rev + str.charAt(i);
		}
		return rev;
	}

	String[] getRevStringArray(String[] arr) {
		//String[] revArr = new String[arr.length];
		for (int i = 0; i < arr.length ; i++) {
			if(checkVowel(arr[i])) {
				arr[i]= getReverseString(arr[i]);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		Challenge2 obj = new Challenge2();
		System.out.println(Arrays.toString(obj.getRevStringArray(input)));
	}
}
