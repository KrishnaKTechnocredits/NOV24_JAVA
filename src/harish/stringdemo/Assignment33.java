package harish.stringdemo;

/**
 * Assignment 33 - 7 Dec
 * 
 * Find the frequency of all upper case character in a given string
 * 
 * Time Taken - 5 min
 */

public class Assignment33 {

	int getCharCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	void printFrequencyOfUpperCaseChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i && Character.isUpperCase(str.charAt(i))) {
				System.out.println("Frequency of char " + str.charAt(i) + " is - " + getCharCount(str, str.charAt(i)));
			}
		}
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		String input = "AABaaccDFeABBCCcDdEs";
		System.out.println("Frequency Map for upper case characters in given string " + input + " is as below-");
		assignment33.printFrequencyOfUpperCaseChars(input);
	}
}