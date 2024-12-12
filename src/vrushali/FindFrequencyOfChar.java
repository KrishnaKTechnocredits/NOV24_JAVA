package vrushali;

//Assignment - 32 : 7th Dec
//print the freq of each character.
//
//input : aakanksha
//
//a -> 4
//k ->2
//n->1
//s->1
//h->1
//
//
//hint : charAt , indexOf

public class FindFrequencyOfChar {

	int getFrequencyOfCharInString(String str, char ch) {
		char currentChar;
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			currentChar = str.charAt(i);
			if (ch == currentChar) {
				frequency++;
			}
		}
		return frequency;
	}

	void printFrequencyOfEachChar(String str) {
		char ch;
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			int index = str.indexOf(ch);//This method gives the first occurrence of character in string .e.g 
			                             //aakanksha in this a occures 4 times but this method gives index of first o
											//Occurrence i.e. 0 same for k .So we print frequency only once not frequncy for
											//each occurrence of a,only printd=s only once not 4 times
			if (i == index) {
				frequency = getFrequencyOfCharInString(str, ch);
				System.out.println("Frequency Of Character "+ch+" In String "+frequency);
			}
		}

	}

	public static void main(String[] args) {
		FindFrequencyOfChar findFrequencyOfChar = new FindFrequencyOfChar();
		findFrequencyOfChar.printFrequencyOfEachChar("aakanksha");
	}
}
