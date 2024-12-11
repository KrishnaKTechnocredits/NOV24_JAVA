package titiksha.string;

public class FrequencyofcapitalLetter {
	int getCount(String str, char a) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			int ch = str.charAt(i);
			if (ch == a) {

				count++;
			}
		}
		return count;
	}

	void getEachCharacterCount(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			FrequencyofcapitalLetter frequencyofcapitalLetter = new FrequencyofcapitalLetter();
			int freq = frequencyofcapitalLetter.getCount(str, ch);
			if (Character.isUpperCase(ch)) {
				int index = str.indexOf(ch); // return the index of first occurance of character
				if (i == index) {
					System.out.println(ch + ":-->" + freq);
				}
			}
		}

	}

	public static void main(String[] args) {
		FrequencyofcapitalLetter frequencyofcapitalLetter = new FrequencyofcapitalLetter();
		frequencyofcapitalLetter.getEachCharacterCount("TeChNoCrEdItS");
	}
}
