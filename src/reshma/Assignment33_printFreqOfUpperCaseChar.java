package reshma;
/* print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4
*/

public class Assignment33_printFreqOfUpperCaseChar {
	int getFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch)
				count++;
		}

		return count;
	}

	void printFreqOfUpperCase(String input) {
		int Uppercasecount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				if (input.indexOf(ch) == i) {
					Uppercasecount = getFreq(input, ch);
					System.out.println("The Freq of UpperCase char " + ch + " - " + Uppercasecount);
				}
			}
		}

	}

	public static void main(String[] args) {
		Assignment33_printFreqOfUpperCaseChar a33 = new Assignment33_printFreqOfUpperCaseChar();
		a33.printFreqOfUpperCase("AABcBBBAdeddd");

	}
}
