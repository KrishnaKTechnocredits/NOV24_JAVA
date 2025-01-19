package mousumi.AssignmentsInString;

public class UpperLowerCaseAssignment24 {
	
	void printdata(String input) {
	  int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0, spaceCount = 0;
		String upperCaseChar = "", lowerCaseChar = "", digits = "", specialChar = "";
		 char ch;
		 for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				upperCount++;
				upperCaseChar += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCount++;
				lowerCaseChar += ch;
			} else if (Character.isDigit(ch)) {
				digitCount++;
				digits += ch;
			} else if (Character.isWhitespace(ch)) {
				spaceCount++;
			} else {
				specialCount++;
				specialChar += ch;
			}
		}
		System.out.println("Uppercase character count is : " + upperCount +
				                    " and Uppercase characters are : " + upperCaseChar);
		System.out.println("Lowercase character count is : " + 
				           lowerCount + " and Lowercase characters are : " + lowerCaseChar);
		System.out.println("digit count is : " + digitCount + " and "
				                                             + "digits are : " + digits);
		System.out.println("space count is : " + spaceCount);
		System.out.println("Special character count is : " + specialCount + 
				                           " and Special characters are : " + specialChar);

	}

	public static void main(String[] args) {
		UpperLowerCaseAssignment24 assign24 = new UpperLowerCaseAssignment24();
		assign24.printdata("Te4c_hnoCredi3t s@");
	}

}
