package prem;

public class Assignment71 {
	
	int getDigitFromEachWord(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				count =count + Character.getNumericValue(ch);
			}
		}
		return count;
	}

	void printCountOfDigitEachWord(String str) {
		String[] words = str.split(" ");
		int maxCount = 0;
		String maxWord ="";

		for (int j = 0; j < words.length; j++) {
			String letter = words[j];
			int count = getDigitFromEachWord(letter);
			  if (maxCount< count) {
				 maxCount = count;
				 maxWord = words[j];
			  }
		}
		System.out.println(maxWord);
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		Assignment71 assign71 = new Assignment71();
		assign71.printCountOfDigitEachWord(str);
	}

}
