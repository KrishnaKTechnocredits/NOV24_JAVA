package anuja.anuja_interview;

import java.util.Scanner;

//Check for Palindrome Input: naman, 1221/
public class Assignment102Pallindrome {
	public static void main(String[] args) {
		Assignment102Pallindrome obj = new Assignment102Pallindrome();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if palindrome or not " + "\n");
		String inputStr = sc.nextLine();
		System.out.println("Please enter a valid num to check is palindrome or not ");
		int inputNum = sc.nextInt();
		if (inputStr == null || inputStr.isEmpty()) {
			System.out.println("Input string is invalid.");
		} else {
			obj.palindromeUsingStringBuffer(inputStr);
			String inputStr2;
			obj.palindromeUsingStringreverse(inputStr2 = inputStr);

		}
		obj.palindromeUsingReverseNum(inputNum);

	}

	private void palindromeUsingReverseNum(int num) {
		System.out.println("-------------------Palindrome for Num method is executed ------------------");
		int inputNum = num;
		int reverseNum = 0;
		while (num > 0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		if (inputNum == reverseNum) {
			System.out.println(inputNum + " and " + reverseNum + " is Palindrome number");
		} else {
			System.out.println(inputNum + " and " + reverseNum + " is not a Palindrome number");

		}
		System.out.println();

	}

	private void palindromeUsingStringreverse(String inputStr) {
		System.out.println(
				"-------------------Palindrome for String using String reverse is executed ------------------");
		String reverseStr = "";
		for (int i = inputStr.length() - 1; i >= 0; i--) {
			reverseStr = reverseStr + inputStr.charAt(i);
		}
		if (inputStr.equals(reverseStr)) {
			System.out.println(inputStr + " and " + reverseStr + " is Palindrome string");
		} else {
			System.out.println(inputStr + " and " + reverseStr + " is not a Palindrome string");

		}
		System.out.println();

	}

	private void palindromeUsingStringBuffer(String inputStr) {
		System.out
				.println("-------------------Palindrome for String using String Buffer is executed ------------------");
		StringBuffer strBuff = new StringBuffer(inputStr);// object of stringBuffer
		StringBuffer reverseStr = strBuff.reverse();
		if (inputStr.equals(reverseStr.toString())) {
			System.out.println(inputStr + " and " + reverseStr + " is Palindrome string");
		} else {
			System.out.println(inputStr + " and " + reverseStr + " is not a Palindrome string");

		}
		System.out.println();

	}
}

/*
 * -----------------------------------------------
 * Common Errors and Fixes for Palindrome Code
 * -----------------------------------------------
 * 1. **StringBuffer/String Comparison:**
 *    - **Fix:** Use `.toString()` to compare `StringBuffer` with `String`.
 *      Example: `if(strBuff.toString().equals(inputStr)) {}`

 * 2. **Reversing a Number:**
 *    - **Fix:** Save original number before reversing.
 *      Example: `int inputNum = num; while(num > 0) { ... }`

 * 3. **Scanner Input Handling:**
 *    - **Fix:** After `nextInt()`, call `nextLine()` to consume newline.
 *      Example: `sc.nextLine(); // consume newline`

 * 4. **String Concatenation in Loops:**
 *    - **Fix:** Use `StringBuilder` for efficient concatenation.
 *      Example: `StringBuilder reverseStr = new StringBuilder();`

 * 5. **Edge Cases (Empty/Null Input):**
 *    - **Fix:** Check for null/empty before proceeding.
 *      Example: `if(inputStr == null || inputStr.isEmpty()) { ... }`
 */

