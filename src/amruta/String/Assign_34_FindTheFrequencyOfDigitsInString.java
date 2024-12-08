/*
Assignment - 34 : 7th Dec [15 mins]
print the frequency of all digit characters.

input : AAB2cBB2BAd2ed3dd
output : 
2 -> 3
3 -> 1
*/

package amruta.String;

public class Assign_34_FindTheFrequencyOfDigitsInString {

	int returnUpperDigitFrequency(String str, char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printFrequency(String str) {
		int frequencyCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				if (str.indexOf(ch) == index) {
					frequencyCount = returnUpperDigitFrequency(str, ch);
					System.out.println("Frequency of Digit " + ch + " is --> " + frequencyCount);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assign_34_FindTheFrequencyOfDigitsInString a34 = new Assign_34_FindTheFrequencyOfDigitsInString();
		a34.printFrequency("AAB2cBB2BAd2ed3dd");
	}
}