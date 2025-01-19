package harish.arraysdemo;

/**
 * Assignment 46 - 15 Dec
 * 
 * Given a String array of names, print all the names and also the middle
 * character in each name.
 * 
 * Hint - If the length of name is even, print character at (length/2 - 1)
 * 
 * Input - { "Rohan", "Premlata", "Anuja", "Fazrana" }
 * 
 * Output - Rohan -> h Premlata -> m Anuja -> u Fazrana -> r
 */

public class Assignment46 {

	void printMiddleCharInNames(String[] names) {
		for (int i = 0; i < names.length; i++) {
			// get the middle character in String based on requirement
			char ch = (names[i].length() % 2 == 0) ? names[i].charAt(names[i].length() / 2 - 1)
					: names[i].charAt(names[i].length() / 2);
			System.out.println(names[i] + " -> " + ch);
		}
	}

	public static void main(String[] args) {
		Assignment46 assignment46 = new Assignment46();
		String[] names = { "Rohan", "Premlata", "Anuja", "Fazrana" };
		assignment46.printMiddleCharInNames(names);
	}
}