package harish.stringdemo;

/**
 * Assignment - 69 : 5th Jan'2025 [IMP]
 * 
 * Print frequency of each word from given String.
 * 
 * Input - String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
 * 
 * Output : Hi -> 4 Hello -> 1 Techno -> 2 Credits -> 1
 */

public class Assignment69 {

	private void printWordsFrequency(String input) {
		String[] arr = input.split(" ");
		System.out.println("Output : ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < arr.length; j++) {
					if (word.equals(arr[j])) {
						arr[j] = "";
						count++;
					}
				}
				System.out.println(word + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		System.out.println("Input : " + str);
		new Assignment69().printWordsFrequency(str);
	}
}