package kishor;

public class Assignment27_AsciiCharacter {
	
	char getAsciiCharacter(int num) {
		char ch = (char)num; //we need to to explicit type cast as integer has 4 byte and character has 2 byte
		return ch;
	}
	
	public static void main(String[] args) {
		Assignment27_AsciiCharacter assignment27 = new Assignment27_AsciiCharacter();
		char ch1=assignment27.getAsciiCharacter(65);
		System.out.println("The Ascii character for given integer value is:- "+ch1);
		char ch2=assignment27.getAsciiCharacter(90);
		System.out.println("The Ascii character for given integer value is:- "+ch2);
		char ch3=assignment27.getAsciiCharacter(55);
		System.out.println("The Ascii character for given integer value is:- "+ch3);
	}
}
