/**
 * 
 */
package harish.stringdemo;

/**
 * Assignment 21 | 24 Nov - Find the length of the given string excluding space.
 * 
 * Time taken = 5 minutes
 */
public class Assignment21 {

	int getLengthOfStringWithoutSpaces(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		String input = "this is a test string to check the output";
		int lengthOfStringWithoutSpaces = assignment21.getLengthOfStringWithoutSpaces(input);
		int spaceCount = input.length() - lengthOfStringWithoutSpaces;
		System.out.println("The length of given string without spaces is: " + lengthOfStringWithoutSpaces);
		System.out.println("Count of spaces in given string is: " + spaceCount);
	}
}
