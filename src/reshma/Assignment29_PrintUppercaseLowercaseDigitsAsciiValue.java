package reshma;

public class Assignment29_PrintUppercaseLowercaseDigitsAsciiValue {
	void printassciiofUppercase(char ch) {
		int ascii = ch;
		System.out.println(ch + " - " + ascii);
	}

	void printasciiOfLowercase(char ch) {
		int ascii = ch;
		System.out.println(ch + " - " + ascii);
	}

	void printasciiOfDigit(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + "  - " + ascii);
	}

	public static void main(String[] args) {
		Assignment29_PrintUppercaseLowercaseDigitsAsciiValue assignment29 = new Assignment29_PrintUppercaseLowercaseDigitsAsciiValue();
		System.out.println("Ascii of Uppercase are");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			assignment29.printassciiofUppercase(ch);
		}

		System.out.println("Ascii of Lowercase are");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			assignment29.printasciiOfLowercase(ch);
		}

		System.out.println("Ascii of Digits are");
		for (char ch = '0'; ch <= '9'; ch++) {
			assignment29.printasciiOfDigit(ch);
		}
	}
}
