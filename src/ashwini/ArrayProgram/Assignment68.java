package ashwini.ArrayProgram;

/*
 Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits


 */
public class Assignment68 {

	String rearrangementOfString(String input) {
		String uCase = "";
		String lCase = "";
		int digitSum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCase = uCase + ch;
			} else if (Character.isLowerCase(ch)) {
				lCase += ch;
			} else if(Character.isDigit(ch))
				digitSum += Character.getNumericValue(ch);
		}
		return uCase + digitSum + lCase;
	}

	public static void main(String[] args) {
		Assignment68 a68 = new Assignment68();
		String input = "Te1ch6NOCre4dits";
		String ans = a68.rearrangementOfString(input);
		System.out.println("Input :" + input);
		System.out.println("Output :" + ans);

	}

}
