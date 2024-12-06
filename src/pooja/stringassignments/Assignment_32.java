/*
//teechnocredits
//t e c h n o c r e d i  t  s
//0 1 2 3 4 5 6 7 8 9 10 11 12 
*/
package pooja.stringassignments;

public class Assignment_32 {

	int getFrequencyOfChars(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				cnt++;
			}
		}
		return cnt;
	}

	void printFrequecyOfCharacterr(String str) {
		System.out.println("The frequency of all characters in given string");
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (i == str.indexOf(ch)) {
				System.out.println(ch + " -> " + getFrequencyOfChars(str, ch));
			}
		}
	}

	public static void main(String[] args) {
		Assignment_32 assignment_32 = new Assignment_32();
		String str = "technocredits";
		assignment_32.printFrequecyOfCharacterr(str);
	}
}