/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment 20 | 24 Nov - Find the given character count from given string.
 * 
 * Time taken = 5 minutes
 */
public class Assignment20 {

	int getCharCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment20 assignment20 = new Assignment20();
		String str = "techno credits java selenium batch nov 2024";
		char ch = 'e';
		int charCount = assignment20.getCharCount(str, ch);
		System.out.println("Count of character " + ch + " in the given string [" + str + "] is: " + charCount);
	}
}
