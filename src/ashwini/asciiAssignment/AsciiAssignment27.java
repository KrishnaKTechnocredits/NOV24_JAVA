package ashwini.asciiAssignment;

public class AsciiAssignment27 {
	void asciiToChar(int ascii) {
		char ch = (char) ascii;
		System.out.println(ch + " is represented by ascii value " + ascii);

	}

	public static void main(String[] args) {
		AsciiAssignment27 assn27 = new AsciiAssignment27();
		assn27.asciiToChar(65);
		assn27.asciiToChar(90);
		assn27.asciiToChar(55);

	}

}
