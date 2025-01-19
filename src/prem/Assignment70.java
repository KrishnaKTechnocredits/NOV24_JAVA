package prem;

public class Assignment70 {

	void getDigitFromEachWord(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		System.out.println(str + " -> " + count);
	}

	void printCountOfDigitEachWord(String str) {
		String[] words = str.split(" ");

		for (int j = 0; j < words.length; j++) {
			String letter = words[j];
			getDigitFromEachWord(letter);
		}
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment70 assign70 = new Assignment70();
		assign70.printCountOfDigitEachWord(str);
	}
}
