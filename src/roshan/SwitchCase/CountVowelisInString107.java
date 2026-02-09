package roshan.SwitchCase;

import java.util.Scanner;

public class CountVowelisInString107 {
	void getVowelCount(String str) {
		str = str.toLowerCase();
		int acount =0;
		int ecount =0;
		int icount =0;
		int ocount =0;
		int ucount =0;

for(int i=0;i<str.length();i++) {
	char currentch = str.charAt(i);

		switch (currentch) {
		case 'a':                 //currentch=='u':
			acount++;
			break;

		case 'e':
			ecount++;
			break;

		case 'i':
			icount++;
			break;

		case 'o':
			ocount++;
			break;

		case 'u':
			ucount++;
			break;

		default:		

		}
}
int sum = acount+ecount+icount+ocount+ucount;
System.out.println("A vowel frequency is " + acount);
System.out.println("E vowel frequency is " + ecount);
System.out.println("I vowel frequency is "+ icount);
System.out.println("O vowel frequency is "+ ocount);
System.out.println("U vowel frequency is "+ ucount);

System.out.println("total vowel frequency is " + sum);
	}

	void getInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("please neter input");
		String input = sc.nextLine();
		getVowelCount(input);
		sc.close();
	}

	public static void main(String[] args) {
		CountVowelisInString107 countvowelisinString = new CountVowelisInString107();
		countvowelisinString.getInput();
	}
}

/*
 * 🔹 Assignment 107: Count Vowels in a String 📥 Input: aaryahi 📊 Total vowel
 * count: 4 🅰 a → 3 ℹ️ i → 1 🔢 Unique vowels: 2 💡 Hint: Use switch-case and a
 * Scanner class for input handling.
 */
