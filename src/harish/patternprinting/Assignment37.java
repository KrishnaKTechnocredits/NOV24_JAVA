package harish.patternprinting;

/**
 * Assignment - 37 : 8th Dec
 * 
 * Write loop inside loop (nested for loop), and print frequency of each
 * character.
 * 
 * input : aakanksha | output : a->4 k->2 n->1 s->1 h->1
 */

public class Assignment37 {

	void printCharacterFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			if (i == str.indexOf(str.charAt(i))) {
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment37 assignment37 = new Assignment37();
		assignment37.printCharacterFrequency("aakanksha");
	}
}