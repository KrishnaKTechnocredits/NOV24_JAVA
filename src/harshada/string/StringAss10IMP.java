package harshada.string;

public class StringAss10IMP {

	// method to find individual frequency of char
	void findCharFreqfromString(String str, char ab) {
		int frequency = 0;
		for (int i = 0; i < str.length(); i++) {// traversing whole string
			char ch = str.charAt(i);// char at running index into ch
			if (ab == ch) {// compare if ch is equals to given char
				frequency++;
			}
		}
		System.out.println("Frequency of char " + ab + " in a given string is " + frequency);
	}

	void findEachCharFreqInString(String str) {
		for (int index = 0; index < str.length(); index++) {// traversing whole string
			char ch = str.charAt(index);// char at running index into ch
			if (index == str.indexOf(ch)) {// comparing character's index(ch) with running index if running index equals
											// with ch's index
				findCharFreqfromString(str, ch);// calling to find char frequency
			}
		}
	}

	public static void main(String[] args) {
		StringAss10IMP stringAss10IMP = new StringAss10IMP();
		stringAss10IMP.findCharFreqfromString("technocredits", 't');
		stringAss10IMP.findEachCharFreqInString("technocredits");
	}
}
