package krishna;

import java.util.Scanner;
//get each char count
public class Assignment20 {
	
	void getCharFreq(String word , char ch) {
		int count = 0;
		
		for(int index = 0; index<word.length(); index++) {
			if(ch == word.charAt(index)) {
				count++;
				System.out.println("in word " + word + ", Freq of " + ch + " is " + count);
			}
		}
	}
	
	void eachCharactorFreq(String input) {
		for(int index =0; index<input.length(); index++) {
			if(index == input.indexOf(input.charAt(index)))
			 getCharFreq(input, input.charAt(index));
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the word : ");
		String input = scanner.next();
		new Assignment20().eachCharactorFreq(input);
	}
}

