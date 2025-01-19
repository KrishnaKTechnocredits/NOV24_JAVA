//Assignment - 37 : 8th Dec [20 mins]
//write loop inside loop (nested for loop), and print frequency of each character. 
//
//input : aakanksha
//a->4
//k->2
//n->1
//s->1
//h->1

package komal.String;

public class Assignment37 {

	void getCharFeguency(String input) {

		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int currentCharIndex = input.indexOf(ch);

			if (i == currentCharIndex) {
				int count = 0;
				for (int j = 0; j < input.length(); j++) {
					char currentChar = input.charAt(j);
					if (ch == currentChar) {
						count++;
					}
				}
				System.out.println("Count of " + ch + " is " + count);
			}
		}
	}

	public static void main(String args[]) {

		Assignment37 a37 = new Assignment37();

		String input = "aakanksha";
		a37.getCharFeguency(input);
	}

}
