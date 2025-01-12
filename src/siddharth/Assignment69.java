package siddharth;
/*
Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.
String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
*/

public class Assignment69 {

	void getFrequencyOfWords(String str) {
		String[] words = str.split(" ");
		for (int i = 0; i < words.length; i++) {
			int count = 0;
			String word = words[i];
			if (!word.equals("")) {
				for (int j = 0; j < words.length; j++) {
					if (word.equals(words[j])) {
						count++;
						words[j] = "";
					}
				}
				System.out.println(word + " -> " + count);
			}

		}

	}

	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		String input = "Hi Hello Hi Hi Hi Techno Credits Techno";
		assignment69.getFrequencyOfWords(input);
	}
}
