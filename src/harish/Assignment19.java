package harish;

/**
 * Assignment 19 | Nov 24 - Program to print the characters of a given string in
 * reverse order
 * 
 * Time taken - 3 minutes
 */

public class Assignment19 {

	void printInputCharsInReverse(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
	}

	public static void main(String[] args) {
		new Assignment19().printInputCharsInReverse("techno credits");
	}
}
