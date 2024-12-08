package harish.stringdemo;

/**
 * Assignment 32 - 7 Dec
 * 
 * Find the frequency of each character in a given string
 */

public class Assignment32 {

	int getCharCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	void printFrequencyOfChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i) {
				System.out.println("Frequency of char " + str.charAt(i) + " is - " + getCharCount(str, str.charAt(i)));
			}
		}
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		String input = "technocredits";
		System.out.println("Frequency Map for given string " + input + " is as below-");
		assignment32.printFrequencyOfChars(input);
	}
}
