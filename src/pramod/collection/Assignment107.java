/* Assignment 107: Count Vowels in a String
📥 Input: aaryahi
📊 Total vowel count: 4
🅰️ a → 3
ℹ️ i → 1
🔢 Unique vowels: 2

💡 Hint: Use switch-case and a Scanner class for input handling.
*/

package pramod.collection;

import java.util.Scanner;

public class Assignment107 {
	
	void findCountOfOVowels(String str) {
		str = str.toLowerCase();
		int countA = 0, countE = 0, countI = 0, countO = 0, countU = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
				countA++;
				break;
			case 'e':
				countE++;
				break;
			case 'i':
				countI++;
				break;
			case 'o':
				countO++;
				break;
			case 'u':
				countU++;
				break;
			}
		}
		System.out.println("Frequency of each char is: ");
		int count = countA+countE+countI+countO+countU;
		if (countA > 0) {
			System.out.println("a -> " + countA);
		}
		if (countE > 0) {
			System.out.println("e -> " + countE);
		}
		if (countI > 0) {
			System.out.println("i -> " + countI);
		}
		if (countO > 0) {
			System.out.println("o -> " + countO);
		}
		if (countU > 0) {
			System.out.println("u -> " + countU);
		}
		System.out.println("Vowels count is: " + count);
	}

	public static void main(String[] args) {
		System.out.println("Enter the string to count the vowels in it: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		new Assignment107().findCountOfOVowels(str);
		sc.close();
	}
}
