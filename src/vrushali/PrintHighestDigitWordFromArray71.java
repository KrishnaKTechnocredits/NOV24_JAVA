package vrushali;
//Assignment - 71 : 5th Jan'2025 [IMP]

//
//return the word having highest digits in the given String .
//String str = "H2i22 H1ello Techno C2red3i3t4s5";
//
//output : C2red3i3t4s5

public class PrintHighestDigitWordFromArray71 {

	int getCountOfDigitsFromWord(String str) {
		int digitsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digitsCount++;
			}
		}
		return digitsCount;
	}

	String returnHighestDigitWord(String str) {
		String[] wordArray = str.split(" ");
		String highestDigitWord = "";
		int highestDigitCount = 0;
		int digitCount = 0;
		for (int i = 0; i < wordArray.length; i++) {
			digitCount = getCountOfDigitsFromWord(wordArray[i]);
			if (highestDigitCount < digitCount) {
				highestDigitCount = digitCount;
				highestDigitWord = wordArray[i];
			}
		}
		return highestDigitWord;
	}

	public static void main(String[] args) {
		PrintHighestDigitWordFromArray71 printHighestDigitWordFromArray71 = new PrintHighestDigitWordFromArray71();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		String highestDigitWord = printHighestDigitWordFromArray71.returnHighestDigitWord(str);
		System.out.println("Word having highest digits in it is :-- "+highestDigitWord);
	}

}
