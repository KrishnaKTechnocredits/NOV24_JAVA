//Assignment - 68 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
//
//input : Te1ch6NOCre4dits
//output : TNOC11echredits

package fazrana.string;

public class FAssignment68 {
	String getRearrangedString(String str) {
		String upperCaseString = "";
		int digitInt = 0;
		String lowerCaseString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseString += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseString += ch;
			} else if (Character.isDigit(ch)) {
				digitInt += Character.getNumericValue(ch);
			}
		}
		return upperCaseString + digitInt + lowerCaseString;
	}

	public static void main(String[] args) {
		String input = "Te1ch6NOCre4dits";
		System.out.println("Input: " + input);
		FAssignment68 fassignment68 = new FAssignment68();
		System.out.println("Output: " + fassignment68.getRearrangedString(input));
	}
}
