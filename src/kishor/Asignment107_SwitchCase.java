package kishor;

import java.util.Scanner;

//🔹 Assignment 107: Count Vowels in a String
//📥 Input: aaryahi
//📊 Total vowel count: 4
//🅰️ a → 3
//ℹ️ i → 1
//🔢 Unique vowels: 2
//💡 Hint: Use switch-case and a Scanner class for input handling.

public class Asignment107_SwitchCase {

	int getCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			switch (ch) {
			case 'a':

			case 'e':

			case 'i':

			case 'o':

			case 'u':

				if (ch1 == ch) {
					count++;
					break;
				}
			}
		}
		return count;
	}

	void displayFreq(String str) {
		int Total = 0;
		int uniqueVowel = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (i == str.indexOf(ch)) {
					uniqueVowel = uniqueVowel + 1;
					int count = getCount(str, ch);
					Total = count + Total;
					System.out.println(ch + "->" + count);
				}
			}
		}
		System.out.println("Total vowel count is:- " + Total);
		System.out.println("Unique vowel count is:- " + uniqueVowel);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		Asignment107_SwitchCase assignment107 = new Asignment107_SwitchCase();
		assignment107.displayFreq(word);
		sc.close();
	}
}
