package AssignmentDemoCode;

import java.util.Scanner;

public class Assignment103 {

	boolean getPalindromeString(String str) {
		String output = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			output += str.charAt(i);
		}

		if (str.equals(output)) {
			return true;
		}
		return false;
	}

	int getPalindromeNumber(int num) {
		int revNumber = 0;
		while (num != 0) {
			int digit = num % 10;
			revNumber = revNumber * 10 + digit;
			num = num / 10;
		}
		return revNumber;
	}

	public static void main(String[] args) {
		Assignment103 test = new Assignment103();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter string");
		String word = sc.next();
		System.out.println("please enter number");
		int num = sc.nextInt();

		if (test.getPalindromeString(word) == true) {
			System.out.println(word + " is palindrome String");
		} else
			System.out.println(word + " is not palindrome String");
		
		if (test.getPalindromeNumber(num) == num) {
			System.out.println(num + " is palindrome String");
		} else
			System.out.println(num + " is not palindrome String");
	}
}
