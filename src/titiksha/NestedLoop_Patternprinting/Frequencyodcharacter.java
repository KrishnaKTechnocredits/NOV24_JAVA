//write loop inside loop (nested for loop), and print frequency of each character. 
//input : aakanksha


package titiksha.NestedLoop_Patternprinting;

public class Frequencyodcharacter {

	void getFrequencyOfCharacter(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			if (str.indexOf(ch) == i) {
				for (int j = 0; j < str.length(); j++) {
					char ch1 = str.charAt(j);
					if (ch == ch1) {
						count++;
					}
				}

				System.out.println(ch + ":" + count);

			}
		}
	}

	public static void main(String[] args) {
		Frequencyodcharacter frequencyodcharacter = new Frequencyodcharacter();
		frequencyodcharacter.getFrequencyOfCharacter("aakansha");
	}
}
