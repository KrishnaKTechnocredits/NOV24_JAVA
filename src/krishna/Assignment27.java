package krishna;

public class Assignment27 {
	
	char getCharacter(int num) {
		char ch = (char) num;
		return ch;
	}

	public static void main(String[] args) {
		System.out.println("Character of Given Ascii Value is : "+ new Assignment27().getCharacter(65));
	}
}
