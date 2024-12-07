package roshan;

public class asciiOfUpperLowerDigit {

	void getUpperCaseascii() {
		System.out.println("upper case Ascii");
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			if (Character.isUpperCase(ch)) {
				int ascii = ch;
				System.out.println(ch + " Ascii value is " + ascii);
			}
		}

	}

	void getLowerCaseascii() {
		System.out.println("Lower case Ascii");
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (Character.isLowerCase(ch)) {
				int ascii = ch;
				System.out.println(ch + " Ascii value is " + ascii);
			}
		}

	}

	void getDigitCaseascii() {
		System.out.println("Digit case Ascii");
		for (char ch = '0'; ch <= '9'; ch++) {
			if (Character.isDigit(ch)) {
				int ascii = ch;
				System.out.println(ch + " Ascii value is " + ascii);
			}

		}
	}

	public static void main(String[] args) {
		asciiOfUpperLowerDigit asciiofupperlowerdigit = new asciiOfUpperLowerDigit();
		asciiofupperlowerdigit.getUpperCaseascii();
		asciiofupperlowerdigit.getLowerCaseascii();
		asciiofupperlowerdigit.getDigitCaseascii();

	}

}

/*----------------------------
Assignment - 29 : 2nd Dec'2024 [20 mins]
write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
-----------------------*/