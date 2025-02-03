package vrushali;


//Assignment - 69 : 5th Jan'2025 [IMP]
//Print frequency of each word from given String.
//
//String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
//
//output : 
//Hi -> 4
//Hello -> 1
//Techno -> 2
//Credits -> 1

public class PrintFerqOfWordInString69 {

	void printFequencyOfWordInString(String str) {
		String[] strArray = str.split(" ");
		String word = "";
		int wordCount = 0;
		for (int i = 0; i < strArray.length; i++) {
			if (!strArray[i].equals("-")) {
				word = strArray[i].trim();
				wordCount = 0;
				for (int j = 0; j < strArray.length; j++) {
					if (word.equals(strArray[j].trim())) {
						wordCount++;
							strArray[j] = "-";
					}
				}
				System.out.println("Frequency Of " + word + " in String Is : " + wordCount);
			}
		}

	}

	public static void main(String[] args) {
		PrintFerqOfWordInString69 printFerqOfWordInString69 = new PrintFerqOfWordInString69();
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		printFerqOfWordInString69.printFequencyOfWordInString(str);

	}
}
