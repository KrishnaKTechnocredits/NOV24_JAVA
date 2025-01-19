/*Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits
*/

package harshada.Array3;

public class Ass68_ReArrangeStringwithDigitSum {

	String reArrangeStringWithDigitSum(String input) {
		String upperCaseString = "";
		String LowerCaseString = "";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCaseString += ch;
				} else if (Character.isLowerCase(ch)) {
					LowerCaseString += ch;
				}
			} else if (Character.isDigit(ch)) {

				sum += Character.getNumericValue(ch);
			}
		} // System.out.println(upperCaseString+sum+LowerCaseString);
		return upperCaseString + sum + LowerCaseString;
	}

	public static void main(String[] args) {
		Ass68_ReArrangeStringwithDigitSum ass68 = new Ass68_ReArrangeStringwithDigitSum();
		System.out.println(ass68.reArrangeStringWithDigitSum("Te1ch6NOCre4dits"));
	}
}
