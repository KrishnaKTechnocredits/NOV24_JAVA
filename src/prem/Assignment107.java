package prem;

import java.util.HashSet;
import java.util.Scanner;

public class Assignment107 {

	void getVowelCount() {
		HashSet<Character> uniqueVowel = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a line of text: ");
		String str = scanner.nextLine();

		int Vowelacount = 0;
		int Vowelecount = 0;
		int Vowelicount = 0;
		int Vowelocount = 0;
		int Vowelucount = 0;
		int totalCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			switch (ch) {
			case 'a':
				Vowelacount++;
				totalCount++;
				uniqueVowel.add(ch);
				break;
			case 'e':
				Vowelecount++;
				totalCount++;
				uniqueVowel.add(ch);
				break;
			case 'i':
				Vowelicount++;
				totalCount++;
				uniqueVowel.add(ch);
				break;
			case 'o':
				Vowelocount++;
				totalCount++;
				uniqueVowel.add(ch);
				break;
			case 'u':
				Vowelucount++;
				totalCount++;
				uniqueVowel.add(ch);
				break;

			}
		}
		System.out.println("Total Vowel count :" + totalCount);
		if (Vowelacount > 0)
			System.out.println("Vowel a count :" + Vowelacount);
		if (Vowelecount > 0)
			System.out.println("Vowel e count :" + Vowelecount);
		if (Vowelicount > 0)
			System.out.println("Vowel i count :" + Vowelicount);
		if (Vowelocount > 0)
			System.out.println("Vowel o count :" + Vowelocount);
		if (Vowelucount > 0)
			System.out.println("Vowel u count :" + Vowelucount);
		System.out.println("unique Vowel :" + uniqueVowel.size());
	}

	public static void main(String[] args) {
		Assignment107 assign107 = new Assignment107();
		assign107.getVowelCount();

	}

}
