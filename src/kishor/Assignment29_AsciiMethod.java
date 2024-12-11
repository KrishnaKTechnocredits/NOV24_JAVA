package kishor;

public class Assignment29_AsciiMethod {

	void asciiUpperCase(char start, char end) {
		for (char ch = start; ch <= end; ch++) {
			int value = ch;
			System.out.println("The ascii value for given character " + ch + " is:-" + value);
		}
	}

	void asciiLowerCase(char start, char end) {
		for (char ch = start; ch <= end; ch++) {
			int value = ch;
			System.out.println("The ascii value for given character " + ch + " is:-" + value);
		}
	}

	void asciiDigit(char start, char end) {
		for (char i = start; i <= end; i++) {
			int ascii = i;
			System.out.println("The ascii value of given character " + i + " is:-" + ascii);
		}
	}

	public static void main(String[] args) {
		Assignment29_AsciiMethod assignment29 = new Assignment29_AsciiMethod();
		assignment29.asciiUpperCase('A', 'Z');
		assignment29.asciiLowerCase('a', 'z');
		assignment29.asciiDigit('0', '9');
	}
}
