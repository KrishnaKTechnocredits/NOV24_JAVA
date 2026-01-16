package ashwini.interview;

import java.util.Arrays;
import java.util.Scanner;

/*
  Assignment 105: Check for Anagram
📥 Input: Listen, Silent
✅ The given strings are anagrams

📥 Input: Techno, chnott
❌ The given strings are not anagrams

💡 Hint: Use sorting and comparison of character arrays.

 */
public class AnagramAssignment105 {
	void getAnagram(String input1,String input2) {

		char[] charArray1=input1.toCharArray();
		char[] charArray2=input2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2)) {
			System.out.println("The given strings are anagrams");
		}else {
			System.out.println("The given strings are not anagrams");
		}
		
	}
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter input1 :");
	String input1=sc.nextLine().toLowerCase();
	System.out.println("Enter input2 :");
	String input2=sc.nextLine().toLowerCase();
	AnagramAssignment105 aa1= new AnagramAssignment105();
	aa1.getAnagram(input1, input2);
	sc.close();
}
}
