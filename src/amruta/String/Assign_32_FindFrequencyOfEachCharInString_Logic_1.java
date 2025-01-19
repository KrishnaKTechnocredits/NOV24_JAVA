/*
 * Assignment - 32 : 6th Dec 2024
Print frequency of each character in a given string.

input : technocredits
output : t --> 2
e --> 2
c --> 2
h --> 1
n --> 1
o --> 1
r --> 1
d --> 1
i --> 1
s --> 1
 */
package amruta.String;

public class Assign_32_FindFrequencyOfEachCharInString_Logic_1 {

	int returnCountOfChar(String str, char ch) {
		int count = 0;
		for (int index = 0; index <= str.length() - 1; index++) {
			if (str.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void findFrequency(String input) {
		int frequencyOfChar = 0;
		for (int index = 0; index <= input.length() - 1; index++) {
			char ch = input.charAt(index);
			if (index == input.indexOf(ch)) {
				frequencyOfChar = returnCountOfChar(input, ch);
				System.out.println("Frequency of char " + ch + " --> " + frequencyOfChar);
			}
		}
	}

	public static void main(String[] args) {
		Assign_32_FindFrequencyOfEachCharInString_Logic_1 a32 = new Assign_32_FindFrequencyOfEachCharInString_Logic_1();
		a32.findFrequency("technocredits");
	}
}
