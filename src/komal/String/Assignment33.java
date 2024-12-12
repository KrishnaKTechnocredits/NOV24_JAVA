//Assignment - 33 : 7th Dec [15 mins]
//print the frequency of uppercase characters.
//
//input : AABcBBBAdeddd
//output : 
//A -> 3
//B -> 4

//Assignment - 34 : 7th Dec [15 mins]
//print the frequency of all digit characters.
//input : AAB2cBB2BAd2ed3dd

package komal.String;

public class Assignment33 {

	void getFreqEachChar(String input, char ch) {
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentCh = input.charAt(i);
			if (currentCh == ch) {
				count++;
			}
		}
		System.out.println("Count of " + ch + " is " + count);
	}

	public static void main(String args[]) {
		Assignment33 a33 = new Assignment33();
		// input : AAB2cBB2BAd2ed3dd
		String input = "AAB2cBB2BAd2ed3dd";
		for (int i = 0; i < input.length(); i++) {
			char currentCh = input.charAt(i);
			int currentIndex = input.indexOf(currentCh);
			if (Character.isUpperCase(currentCh) && currentIndex == i) {
				a33.getFreqEachChar(input, currentCh);
			} else if (Character.isDigit(currentCh) && currentIndex == i) {
				a33.getFreqEachChar(input, currentCh);
			}
		}

	}

}
