package siddharth;

import java.util.Scanner;

/*
Assignment 103: Check for Palindrome
Input: naman, 1221
naman is a palindrome string
1221 is a palindrome number
techno is not a palindrome string
1211 is not a palindrome number

Hint: A palindrome remains the same when reversed.
 */
public class Assignment103 {
	
//	String palindrome ="";
	void printPalindrome(String input) {
		StringBuilder builder = new StringBuilder(input);
		String palindrome = builder.reverse().toString(); //To String required
		
//		for(int i=input.length()-1;i>=0;i--) {
//			char ch = input.charAt(i);
//			palindrome = palindrome+ch;
//		}
		if(!input.matches("\\d+")) { //Regular exp.(regex) that matches one or more digits (0-9) in a string.
			if(palindrome.equals(input)){
			System.out.println(input+" is a palindrome String");
			}else{
			System.out.println(input+" is not a palindrome String");
			}
		}else if(input.matches("\\d+")) {
			if(palindrome.equals(input)){
			System.out.println(input+" is a palindrome Number");
			}else{
			System.out.println(input+" is not a palindrome Number");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment103 assignment103 = new Assignment103();
		System.out.println("Enter your String/Number:");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		assignment103.printPalindrome(input);
		
		sc.close();
	}
}
