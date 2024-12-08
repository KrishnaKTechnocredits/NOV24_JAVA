
/*
Assignment - 33 : 7th Dec [15 mins]
print the frequency of uppercase characters.

input : AABcBBBAdeddd
output : 
A -> 3
B -> 4
*/

package amruta.String;

public class Assign_33_FindTheFrequencyOfUpperCharInString {

	int returnUpperCharFrequency(String str, char ch) {
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
			if (Character.isUpperCase(ch)) {
				if (str.indexOf(ch) == index) {
					frequencyCount = returnUpperCharFrequency(str, ch);
					System.out.println("Frequency of char " + ch + " is --> " + frequencyCount);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assign_33_FindTheFrequencyOfUpperCharInString a33 = new Assign_33_FindTheFrequencyOfUpperCharInString();
		a33.printFrequency("AABcBBBAdeddd");
	}
}