package ashwini.stringAssignments;

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

	void getFrequencyOfEachWord(String input) {
		String[] words = input.split(" "); // split line by space
		for (int index = 0; index < words.length; index++) {
			// System.out.println(words[index]);
			String word = words[index];
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < words.length; j++) {
					if (word.equals(words[j])) {
						words[j] = "";
						count++;
					}
				}
				System.out.println(word + "-->" + count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		Assignment69 a69 = new Assignment69();
		a69.getFrequencyOfEachWord(str);
	}

}
