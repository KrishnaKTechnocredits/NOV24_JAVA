/*
 Assignment 103: Check for Palindrome
📥 Input: naman, 1221
✅ naman is a palindrome string
✅ 1221 is a palindrome number
❌ techno is not a palindrome string
❌ 1211 is not a palindrome number

💡 Hint: A palindrome remains the same when reversed.
 */

package imran.PalindromeProgram;

import java.util.Scanner;

public class Assignment103_Palindrome {

	void checkPalindrome(String data)
	{
		char ch = data.charAt(0);
		if(Character.isDigit(ch))
		{
			int num = Integer.parseInt(data);
			int digit = num;
			int revDigit = 0;
			while(num !=0)
			{
				revDigit = revDigit *10 + num%10;
				num = num/10;
			}
			if(revDigit == digit)
			{
				System.out.println("The given number is " + digit + " And its reverse is "+ revDigit + ". Hence it is Palindrome Digit.");
			}
			else
			{
				System.out.println("The given number is " + digit + " And its reverse is "+ revDigit + ". Hence it is not Palindrome Digit.");
			}
		}
		else
		{
			String revWord = "";
			for(int i =0; i<data.length();i++)
			{
				char k  = data.charAt(i);
				revWord = k + revWord;
			}
			if(revWord.equals(data))
			{
				System.out.println("The given String is " + data + " And its reverse is "+ revWord + ". Hence it is Palindrome String.");	
			}
			else
			{
				System.out.println("The given String is " + data + " And its reverse is "+ revWord + ". Hence it is not a Palindrome String.");
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment103_Palindrome assignment103 = new Assignment103_Palindrome();
		Scanner sc = new Scanner(System.in);
		String data = "1221";
		assignment103.checkPalindrome(data);
		data = "naman";
		assignment103.checkPalindrome(data);
		System.out.println("Please Enter data to check palindrome");
		String str = sc.nextLine();
		assignment103.checkPalindrome(str);
		sc.close();
	}
}
