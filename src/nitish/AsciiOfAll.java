package nitish;

public class AsciiOfAll {
	
	void Values() {
		System.out.println("ASCII values of uppercase letters (A-Z):");
		for (char x = 'A'; x <= 'Z'; x++) {
			System.out.print((int) x+" ");
		}
		
		System.out.println("\n\nASCII values of lowercase letters (a-z):");
		for (char x = 'a'; x <= 'z'; x++) {
			System.out.print((int) x+" ");
		}
		
		System.out.println("\n\nASCII values of digits (0-9):");
		for (char x = '0'; x <= '9'; x++) {
			System.out.print((int) x+" ");
		}
	}

	public static void main(String[] args) {
		AsciiOfAll aAsciiOfAll = new AsciiOfAll();
		aAsciiOfAll.Values();

	}

}
