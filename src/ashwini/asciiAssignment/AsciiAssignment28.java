package ashwini.asciiAssignment;

public class AsciiAssignment28 {

	void asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " is represented by ascii value " + ascii);
	}

	public static void main(String[] args) {
		AsciiAssignment28 assn28 = new AsciiAssignment28();
		for (int num = 65; num <= 100; num++) {
			assn28.asciiToChar(num);
		}
	}

}
