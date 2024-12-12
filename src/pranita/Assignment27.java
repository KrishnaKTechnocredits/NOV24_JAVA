package pranita;

public class Assignment27 {

	 char getCharacterFromAscii(int input) {
		return (char) input;
	}

	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		int input = 65;
		char characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character of Ascii value " + input + " is - " + characterFromAscii);

		input = 90;
		characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character of Ascii value " + input + " is - " + characterFromAscii);

		input = 55;
		characterFromAscii = assignment27.getCharacterFromAscii(input);
		System.out.println("The Character of Ascii value " + input + " is - " + characterFromAscii);
	}
}