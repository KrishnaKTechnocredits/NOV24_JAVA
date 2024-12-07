/*
 * /*
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

public class Assign_32_FindFrequencyOfEachCharInString_Logic_2 {
	
	void findFrequency(String str) {
		for (int index = 0; index <= str.length() - 1; index++) {
			char ch = str.charAt(index);
			if (index == str.indexOf(ch)) {
				int frequencyOfChar = 0;
				for (int innerIndex = 0; innerIndex <= str.length() - 1; innerIndex++) {
					if (str.charAt(innerIndex) == ch)
						frequencyOfChar++;
				}
				System.out.println("Frequency of char " + ch + " --> " + frequencyOfChar);
			}
		}
	}

	public static void main(String[] args) {
		Assign_32_FindFrequencyOfEachCharInString_Logic_2 a32 = new Assign_32_FindFrequencyOfEachCharInString_Logic_2();
		a32.findFrequency("reference");
	}
}
