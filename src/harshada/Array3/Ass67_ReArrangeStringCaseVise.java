/*Assignment - 67 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by digits followed by lowercase.

input : Te1ch6NOCre3dits
output : TNOC163echredits*/

package harshada.Array3;

public class Ass67_ReArrangeStringCaseVise {

	void reArrangeString(String str) {
		String upperCase = "";
		String lowerCase = "";
		String digit = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch)) {
					upperCase += ch;
				} else if (Character.isLowerCase(ch)) {
					lowerCase += ch;
				}
			} else if (Character.isDigit(ch)) {
				digit += ch;
			}
		}
		System.out.println(upperCase + digit + lowerCase);
	}

	public static void main(String[] args) {
		Ass67_ReArrangeStringCaseVise ass67 = new Ass67_ReArrangeStringCaseVise();
		ass67.reArrangeString("Te1ch6NOCre3dits");
	}
}
