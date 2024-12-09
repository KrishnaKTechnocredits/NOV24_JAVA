package reshma;
/* print the frequency of all digit characters.
input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
*/

public class Assignment34_printFreqOfDigit {
	int getFreq(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	void printFreqOfDigit(String input) {
		int Digitcount = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			int index=input.indexOf(ch);
			if (Character.isDigit(ch) && index==i) {
				//if (input.indexOf(ch) == i) {
					Digitcount = getFreq(input, ch);
					System.out.println("The Freq of Digit " + ch + "  - " + Digitcount);
				}
			}
		}
	

	public static void main(String[] args) {
		Assignment34_printFreqOfDigit assignment34 = new Assignment34_printFreqOfDigit();
		assignment34.printFreqOfDigit("AAB2cBB2BAd2ed3dd");
	}
}
