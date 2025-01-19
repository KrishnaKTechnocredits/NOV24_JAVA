package anuja.string;

/*write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).*/

public class Assignment29 {

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();

		System.out.println("-------------Ascii of lower alphabets from a to z --------------------------");
		char chLower = 'A';
		for (; chLower <= 'Z'; chLower++) {
			int asciiResult = assignment29.getAscii(chLower);
			System.out.print(chLower + " --> " + asciiResult+" ,");

		}
		System.out.println();
		System.out.println("-------------Ascii of upper alphabets from A to Z --------------------------");
		char chUpper = 'a';
		for (; chUpper <= 'c'; chUpper++) {
			int asciiResult1 = assignment29.getAscii(chUpper);
			System.out.println(chUpper + " -> " + asciiResult1);

		}
		System.out.println("-------------Ascii of digits from 0 to 9 --------------------------");
		char chDigit = '0';
		for (; chDigit <= '2'; chDigit++) {
			int asciiResult2 = assignment29.getAscii(chDigit);
			System.out.println(chDigit + " -> " + asciiResult2);

		}

	}

	public int getAscii(char ch) {
		int ascii = ch;
		return ascii;

	}

}
