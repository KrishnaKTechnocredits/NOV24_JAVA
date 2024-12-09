//print the frequency of all digit characters.
//input : AAB2cBB2BAd2ed3dd

package titiksha.string;

public class Frequencyofdigit {
	int getCharacterCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);
			if (ch == c) {
				// if(Character.isDigit(ch)) {
				count++;
			}

		}

		return count;
	}

	void getFrequencyOfCharacter(String str) {
		for (int j = 0; j < str.length(); j++) {
			char ch = str.charAt(j);
			int index = str.indexOf(ch);
			if (Character.isDigit(ch)) {
				Frequencyofdigit frequency = new Frequencyofdigit();
				int freq = frequency.getCharacterCount(str, ch);
				if (index == j) {
					System.out.println(ch + ":" + freq);
				}
			}
		}
	}

	public static void main(String[] args) {
		Frequencyofdigit frequencyofdigit = new Frequencyofdigit();
		frequencyofdigit.getFrequencyOfCharacter("AAB2cBB2BAd2ed3dd");
	}
}
