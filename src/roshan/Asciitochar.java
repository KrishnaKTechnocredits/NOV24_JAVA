package roshan;

public class Asciitochar {

	static Character CharOfAscii(int ascii) {

		char ch = (char) ascii; // expliclite type cast as we can store int value in character
		return ch;

	}

	public static void main(String[] args) {

		System.out.println("Ascii value is represented by " + Asciitochar.CharOfAscii(97));
	}

}
