package Assignment_Array;

public class Assignment70 {
	
	int getDigitCount(String str) {
		int digitCount = 0;
		for(int i  = 0;i<str.length();i++) {
			if(Character.isDigit(str.charAt(i))) {
				digitCount++;
			}
		}
		return digitCount;
	}
	
	void printDigitCountInEachWord(String str) {
		String[] arrOfWords = str.split(" ");
		for(int i = 0;i<arrOfWords.length;i++) {
			System.out.println(arrOfWords[i] + " digit count " + getDigitCount(arrOfWords[i]));
		}
	}

	public static void main(String[] args) {
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		new Assignment70().printDigitCountInEachWord(str);
	}
}
