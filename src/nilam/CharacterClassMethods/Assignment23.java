package nilam.CharacterClassMethods;

//Print count of uppercase, lowercase, digit, space and special characters in given input string. [20 mins]
public class Assignment23 {

	void getCount(String str) {

		int upCount = 0, lrCount = 0, digCount = 0, spcCount = 0, spCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) 
					upCount++;
				if (Character.isLowerCase(ch))
						lrCount++;
			} else if (Character.isDigit(ch)) 
					digCount++;
			else if (ch == ' ')
					spCount++;
				else
					spcCount++;
		}
		
		System.out.println("UpperCase: " + upCount + "\nLowerCase: " + lrCount + "\nDigits: " + digCount
				+ "\nSpaces: " + spCount + "\nSpecial Characters: " + spcCount);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.getCount("Te4c_hno Credi3ts");
	}
}
