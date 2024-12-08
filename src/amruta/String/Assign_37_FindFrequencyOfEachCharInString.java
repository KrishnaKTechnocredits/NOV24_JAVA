/*
 * Assignment - 37 : 8th Dec [20 mins]
write loop inside loop (nested for loop), and print frequency of each character. 

input : aakanksha
a->4
k->2
n->1
s->1
h->1
 */
 
package amruta.String;


public class Assign_37_FindFrequencyOfEachCharInString {
	
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
		Assign_37_FindFrequencyOfEachCharInString a32 = new Assign_37_FindFrequencyOfEachCharInString();
		a32.findFrequency("aakanksha");
	}
}