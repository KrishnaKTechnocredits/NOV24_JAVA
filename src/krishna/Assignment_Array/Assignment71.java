package Assignment_Array;

public class Assignment71 {

	int getDigitCount(String str) {
		int digitCount = 0;
		for(int i  = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
		}
		return digitCount;
	}
	
	String getWordHavingMaxDigit(String str) {
		String[] arrOfWords = str.split(" ");
		String maxDigitWord = arrOfWords[0];
		int maxDigitCount = 0;
		for(int i = 0;i<arrOfWords.length;i++) {
			if(maxDigitCount<=getDigitCount(arrOfWords[i])) {
				maxDigitCount = getDigitCount(arrOfWords[i]);
				maxDigitWord = arrOfWords[i];
			}
		}
		return maxDigitWord;
	}
	
	public static void main(String[] args) {
		String str = "H2i22 H1ello Tec465189456hno C2red3i8468453t4s5";
		System.out.println(new Assignment71().getWordHavingMaxDigit(str));
	}
}
