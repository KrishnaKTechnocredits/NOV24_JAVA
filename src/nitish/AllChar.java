package nitish;

public class AllChar {

	void aToz() {
		System.out.println("all the characters having ascii value from 65 to 100.");
		for (int x = 65; x <= 100; x++) {
			System.out.print((char) x+" ");
		}
	}
	
	void Values() {
		System.out.println("ascii values for character A to Z.");
		for (char x = 'A'; x <= 'Z'; x++) {
			System.out.print((int) x+" ");
		}
	}

	public static void main(String[] args) {
		AllChar allChar = new AllChar();
		allChar.aToz();
		System.out.println("\n");
		allChar.Values();

	}

}
