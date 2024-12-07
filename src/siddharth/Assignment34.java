package siddharth;

//Assignment - 34 : 7th Dec [15 mins] print the frequency of all digit characters.

public class Assignment34 {
	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	void printCharFreq(String str) {
		System.out.println("Input is : "+str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (i == index && Character.isDigit(ch)) {
				int freq = getCharFreq(str, ch);
				System.out.println(ch + " > " + freq);
			}
		}
	}
	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		assignment34.printCharFreq("AAB2cBB2BAd2ed3dd");
	}
}
