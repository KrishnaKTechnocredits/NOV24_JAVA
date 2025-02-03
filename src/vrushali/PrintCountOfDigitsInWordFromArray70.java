package vrushali;

//Assignment - 70 : 5th Jan'2025 [IMP]
//
//Print count of digit in each word.
//String str = "H2i22 H1ello Techno C2red3i3t4s5";
//
//output : 
//H2i22 -> 3
//H1ello -> 1
//Techno -> 0
//C2red3i3t4s5 -> 5

public class PrintCountOfDigitsInWordFromArray70 {
	int getCountOfDigitsFromWord(String str) {
		int digitsCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digitsCount++;
			}
		}
		return digitsCount;
	}

	void printCountOfDigitsFromWord(String str) {
		String[] wordArray = str.split(" ");
		int digitCount = 0;
		for (int i = 0; i < wordArray.length; i++) {
			digitCount = getCountOfDigitsFromWord(wordArray[i]);
			System.out.println(wordArray[i] + "-->" + digitCount);
		}
	}

	public static void main(String[] args) {
		PrintCountOfDigitsInWordFromArray70 printCountOfDigitsInWordFromArray70 = new PrintCountOfDigitsInWordFromArray70();
		String str = "H2i22 H1ello Techno C2red3i3t4s5";
		printCountOfDigitsInWordFromArray70.printCountOfDigitsFromWord(str);
	}
}
