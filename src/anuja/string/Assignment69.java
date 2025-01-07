package anuja.string;

import java.util.Arrays;

/*Assignment - 69 : 5th Jan'2025 [IMP]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1*/
public class Assignment69 {

	public void getFrequencyOfEachWord(String longStr) {
		String[] words = longStr.split(" ");
		for (int i = 0; i < words.length; i++) {
			String singleWord = words[i];
			int count = 0;
			if (!singleWord.equals("")) {
				for (int j = 0; j < words.length; j++) {
					if (singleWord.equals(words[j])) {
						count++;
						words[j] = "";
					}
				}
				System.out.println(singleWord + " --> " + count);

			}
		}

	}

	public static void main(String[] args) {
		Assignment69 assignment69 = new Assignment69();
		String input = "Hi Hello Hi Hi Hi Techno Credits Techno";
		System.out.println("Input String is: \n" +input);
		assignment69.getFrequencyOfEachWord(input);
	}
}
