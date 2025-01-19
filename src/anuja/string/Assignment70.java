package anuja.string;

import roshan.IsDigitPro;

/*Assignment - 70 : 5th Jan'2025 [IMP]

Print count of digit in each word.
String str = "H2i22 H1ello Techno C2red3i3t4s5";

output : 
H2i22 -> 3
H1ello -> 1
Techno -> 0
C2red3i3t4s5 -> 5*/
public class Assignment70 {
	public void getCountOfDigitFromEachWord(String longStr) {
		String[] words = longStr.split(" ");
		for (int i = 0; i < words.length; i++) {
			String singleWord = words[i];
			int count = 0;
			for (int j = 0; j < singleWord.length(); j++) {
				if (Character.isDigit(singleWord.charAt(j))) {
					count++;
				}
			}

			System.out.println(singleWord + " --> " + count);
		}
	}

	public static void main(String[] args) {
		Assignment70 assignment70 = new Assignment70();
		String longStr = "H2i22 H1ello Techno C2red3i3t4s5";
		System.out.println("Input String is: \n" + longStr);
		System.out.println("-----------------------------------------");
		assignment70.getCountOfDigitFromEachWord(longStr);
	}
}
