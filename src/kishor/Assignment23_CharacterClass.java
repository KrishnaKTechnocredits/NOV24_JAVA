package kishor;

public class Assignment23_CharacterClass {

	void displayCharacters(String str) {
		int uCount = 0, sCount = 0, lCount = 0, dCount = 0, specialCount = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					uCount++;
				} else {
					lCount++;
				}
			} else if (Character.isDigit(ch)) {
				dCount++;
			} else if (ch == ' ') {
				sCount++;
			} else {
				specialCount++;
			}
		}
		System.out.println("uppercase -> " + uCount);
		System.out.println("lowercase -> " + lCount);
		System.out.println("Digit count -> " + dCount);
		System.out.println("Space count ->" + sCount);
		System.out.println("Special character -> " + specialCount);
	}

	public static void main(String[] args) {
		Assignment23_CharacterClass assignment23 = new Assignment23_CharacterClass();
		assignment23.displayCharacters("Te4c_hno Credi3ts");
	}
}
