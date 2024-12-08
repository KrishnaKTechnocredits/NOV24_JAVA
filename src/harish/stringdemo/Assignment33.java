package harish.stringdemo;

/**
 * Assignment 33 - 7 Dec
 * 
 * Find the frequency of all upper case character in a given string
 * 
 * Time Taken - 5 min
 */

public class Assignment33 {

	void printFrequencyOfUpperCaseChars(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == i && Character.isUpperCase(str.charAt(i))) {
				/**
				 * Creating object of Assignment32 class to re-use the method
				 * getCharacterFrequency() from that class
				 */
				Assignment32 assignment32 = new Assignment32();
				System.out.println("Frequency of char " + str.charAt(i) + " is - "
						+ assignment32.getCharacterFrequency(str, str.charAt(i)));
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