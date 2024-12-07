package ashwini.asciiAssignment;

public class AsciiAssignment28 {

	void asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " is represented by ascii value " + ascii);
	}
	void charToAscii(char ch1) {
		 int ascii1= ch1;
		System.out.println(ascii1 + " is represented by character value " + ch1);
	}

	public static void main(String[] args) {
		AsciiAssignment28 assn28 = new AsciiAssignment28();
		for (int num = 65; num <= 100; num++) {
			assn28.asciiToChar(num);
		}
		for (int ch2 = 'A'; ch2 <= 'Z'; ch2++) {
			assn28.charToAscii((char) ch2);
		}
	}
	}


