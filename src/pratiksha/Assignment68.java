package pratiksha;
/*
 Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits

int digitSum = 0;

if(Character.isDigit(ch)){
	digitSum += Character.getNumericValue(ch);
}

return uCaseStr + digitSum + lCaseStr;
 */
public class Assignment68 {
	static String upperCase = "";
	static String lowerCase = "";
	static int digit;

	void rearrangeString(String input) {
		String output = "";

		for (int i = 0; i <= input.length() - 1; i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCase = upperCase + input.charAt(i);
			}
			if (Character.isDigit(ch)) {
				int digit1 = Character.getNumericValue(ch);
				digit = digit + digit1;
			}
			if (Character.isLowerCase(ch)) {
				lowerCase = lowerCase + input.charAt(i);
			}
		}
		output = upperCase + digit + lowerCase;
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment68 assign68 = new Assignment68();
		String input = "Te1ch6NOCre4dits";
		assign68.rearrangeString(input);
	}

}
