package vrushali.assciiProgram;

//Assignment - 29 : 2nd Dec'2024 [20 mins]
//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).

public class PrintAsciiValue {

	void printAsciiForGivenRangeChar(char startChar, char endChar) {
		int ascii = 0;
		for (char ch = startChar; ch <= endChar; ch++) {
			ascii = ch;
			System.out.println(ch + "-> " + ascii);
		}
	}

	public static void main(String[] args) {
		PrintAsciiValue printAsciiValue = new PrintAsciiValue();
		printAsciiValue.printAsciiForGivenRangeChar('A', 'Z');
		printAsciiValue.printAsciiForGivenRangeChar('a', 'z');
		printAsciiValue.printAsciiForGivenRangeChar('0', '9');
	}

}
