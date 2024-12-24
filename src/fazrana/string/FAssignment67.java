//Assignment - 67 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by digits followed by lowercase.
//
//input : Te1ch6NOCre3dits
//output : TNOC163echredits

package fazrana.string;

public class FAssignment67 {
	String getRearrangedString(String str) {
		String upperCaseString = "";
		String digitString = "";
		String lowerCaseString = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseString += ch;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseString += ch;
			} else if (Character.isDigit(ch)) {
				digitString += ch;
			}
		}
		return upperCaseString + digitString + lowerCaseString;
	}

	public static void main(String[] args) {
		String input = "Te1ch6NOCre3dits";
		System.out.println("Input: " + input);
		FAssignment67 fassignment67 = new FAssignment67();
		System.out.println("Output: " + fassignment67.getRearrangedString(input));
	}
}
