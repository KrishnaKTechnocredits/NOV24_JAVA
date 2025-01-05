/*
Assignment - 69 : 5th Jan'2025 [IMP] [11 mins]
Print frequency of each word from given String.

String str = "Hi Hello Hi Hi Hi Techno Credits Techno";

output : 
Hi -> 4
Hello -> 1
Techno -> 2
Credits -> 1
*/

package pramod.arraydemo;

class Assignment69 {

	void printFrequencyOfEachWordFromString(String str) {
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
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		Assignment69 A69 = new Assignment69();
		System.out.println("Given Sting is :" + str);
		A69.printFrequencyOfEachWordFromString(str);

	}
}