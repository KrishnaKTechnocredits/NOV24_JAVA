package nitish;

public class CharMethods {

	void getUpper(String str) {
		int upperC = 0;
		int lowerC = 0;
		int digitC = 0;
		int spaceC = 0;
		int specialC = 0;
		for (int num = 0; num < str.length(); num++) {
			char ch = str.charAt(num);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					upperC++;
				}else{
					lowerC++;
				}
			}else if (Character.isDigit(ch)) {
				digitC++;
			}else if(ch == ' ') {
				spaceC++;
			}else {
				specialC++;
			}
		}
		System.out.println("Number of Uppercase Letters: " + upperC);
        System.out.println("Number of Lowercase Letters: " + lowerC);
        System.out.println("Number of Digits: " + digitC);
        System.out.println("Number of Spaces: " + spaceC);
        System.out.println("Number of Special Characters: " + specialC);
	}

	public static void main(String[] args) {
		String str = "Nit0_3iS1h0 @ Meh56_T8a";
		System.out.println("Input we are giving is '" + str + "'\n");
		CharMethods charMethods = new CharMethods();
		charMethods.getUpper(str);

	}

}
