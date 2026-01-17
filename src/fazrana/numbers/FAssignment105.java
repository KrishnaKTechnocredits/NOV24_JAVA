//🔹 Assignment 105: Check for Anagram
//📥 Input: Listen, Silent
//✅ The given strings are anagrams
//
//📥 Input: Techno, chnott
//❌ The given strings are not anagrams
//
//💡 Hint: Use sorting and comparison of character arrays.


package fazrana.numbers;

import java.util.Arrays;

public class FAssignment105 {//without array
	void isAnagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		int count=0;
		if(str1.length()==str2.length()) {
			for(int i=0; i<str1.length();i++) {
				count=0;
				char ch= str1.charAt(i);
				for (int j=0;j<str2.length();j++) {
					if(ch==str2.charAt(j)) {
						count++;
						break;
					}
				}
				if(count==0) {
					break;
				}
			}	
		}
		if(count==0) {
			System.out.println(str1+" and "+str2+" are not anagram");
		}else {
			System.out.println(str1+" and "+str2+" are anagram");
		}
	}
	
	void isAnagram2(String str1,String str2) {
		System.out.println("Input value: "+str1+ " and "+ str2);
		String[] array1=str1.toLowerCase().split("");
		String[] array2=str2.toLowerCase().split("");
		Arrays.sort(array1);
		Arrays.sort(array2);
		int count=0;
		if(array1.length==array2.length) {
			for(int i=0;i<array1.length;i++) {
				if(!array1[i].equals(array2[i])) {
					count++;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println(str1+" and "+str2+" are anagram");
		}else {
			System.out.println(str1+" and "+str2+" are not anagram");
		}
	}
	
	
	
	public static void main(String[] args) {
		FAssignment105 fassignment105=new FAssignment105();
		fassignment105.isAnagram2("techno", "noteco");
	}
}
