package kishor;

import java.util.Arrays;
public class Test_Example2 {
	
	int isStringContainVowel(String str) {
		int count=0;
		String updatedStr = str.substring(0).toLowerCase();
		for(int i=0;i<updatedStr.length();i++) {
			if(updatedStr.charAt(i)==('a')||updatedStr.charAt(i)==('e')||updatedStr.charAt(i)==('i')||updatedStr.charAt(i)==('o')||updatedStr.charAt(i)==('u')) {
				count++;
			}
		}
		return count;
	}
	
	String getRevString(String str) {
		String s= "";
		for(int i=str.length()-1;i>=0;i--) {
			char ch = str.charAt(i);
			s= s+ch;
		}
		return s;
	}
	
	String getSameString(String str) {
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			s=s+ch;
		}
		return s;
	}
	
	String[] getModifiedArray(String[] arr) {
		String[] obj = new String[arr.length];
		for(int i=0;i<arr.length;i++) {
			String str=arr[i];
			if(isStringContainVowel(str)>1) {
				obj[i]=getRevString(str);
			}
			else {
				obj[i]=getSameString(str);
			}
		}
		return obj;
	}
	
	public static void main(String[] args) {
		String[] input = {"apple", "sky", "orange", "try", "eagle"};
		Test_Example2 test2 = new Test_Example2();
		String[] ans=test2.getModifiedArray(input);
		System.out.println(Arrays.toString(ans));
	}
	
}
