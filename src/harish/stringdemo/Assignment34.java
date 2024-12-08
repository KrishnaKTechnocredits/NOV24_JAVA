package harish.stringdemo;

/**
 * Assignment - 34 : 7th Dec
 * 
 * Print the frequency of all digit characters.
 */

public class Assignment34 {

	private void printDigitFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)) && str.indexOf(str.charAt(i)) == i) {
				/**
				 * Creating object of Assignment32 class to re-use the method
				 * getCharacterFrequency() from that class
				 */
				Assignment32 assignment32 = new Assignment32();
				System.out.println("Frequency of " + str.charAt(i) + " is -> "
						+ assignment32.getCharacterFrequency(str, str.charAt(i)));
			}
		}
	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		String input = "AAB2cBB2BAd2ed3dd";
		assignment34.printDigitFrequency(input);
	}
}