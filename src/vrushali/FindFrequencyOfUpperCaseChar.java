package vrushali;

//Assignment - 33 : 7th Dec [15 mins]
//print the frequency of uppercase characters.
//
//input : AABcBBBAdeddd
//output : 
//A -> 3
//B -> 4

public class FindFrequencyOfUpperCaseChar {

	int getFrequencyOfChar(String str, char ch) {
		int frequency = 0;
		char currentChar;
		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if (currentChar == ch) {
				frequency++;
			}
		}
		return frequency;
	}

	void printFrequencyOfUpperCaseChar(String str) {
		int frequencyUp = 0;
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (Character.isUpperCase(ch) && i == index) {
				frequencyUp = getFrequencyOfChar(str, ch);
				System.out.println(ch + "-> " + frequencyUp);
			}
		}
	}

	public static void main(String[] args) {
		FindFrequencyOfUpperCaseChar findFrequencyOfUpperCaseChar = new FindFrequencyOfUpperCaseChar();
		findFrequencyOfUpperCaseChar.printFrequencyOfUpperCaseChar("AABcBBBAdeddd");

	}
}
