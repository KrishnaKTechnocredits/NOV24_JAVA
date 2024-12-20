/*Assignment - 34 : 7th Dec [15 mins]
print the frequency of all digit characters.
input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1*/


package prashant;

public class Assignment34 {
	
	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char currentCh = input.charAt(index);
			if (ch == currentCh)
				count++;
		}
		return count;
	}

	void printFreqOfAllDigitChar(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int charIndex = input.indexOf(ch);
			if (Character.isDigit(ch) && (charIndex == index)) {
				int count = getCharFreq(input, ch);
				System.out.println(ch + "->" + count);
			}
		}
	}

	public static void main(String[] args) {

		Assignment34 assignment34 = new Assignment34();
		assignment34.printFreqOfAllDigitChar("AAB2cBB2BAd2ed3dd");

	}

}
