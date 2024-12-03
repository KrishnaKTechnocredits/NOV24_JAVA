package deepali.asciiDemo;

//write a method to print asscii of Uppercase (A-Z), lowercase(a-z) and all digits (0-9).
public class Assignment_29 {
	void getAsciiForLetters(char startLetter, char endLetter) {
		for (char value = startLetter; value <= endLetter; value++) {
			int asciiValue = value;
			System.out.println(asciiValue);
		}
		System.out.println("---------------");
	}

	public static void main(String[] args) {
		Assignment_29 assignment = new Assignment_29();
		assignment.getAsciiForLetters('A','Z');
		assignment.getAsciiForLetters('a','z');
		assignment.getAsciiForLetters('0','9');
	}
}
