package rohan;

/*
 * Assignment - 68 : 23rd Dec (IMP) [15 mins]
Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.

input : Te1ch6NOCre4dits
output : TNOC11echredits
 */
public class Assignment_68 {

	public static void main(String[] args) {
		Assignment_68 assignment = new Assignment_68();
		String output = assignment.StringOrder("Te1ch6NOCre4dits");
		System.out.println("Output: " + output);
	}

	String StringOrder(String str) {
		String UpperCaseOutput = "";
		String NumSumOutput = "";
		String LowerCaseOutput = "";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				UpperCaseOutput += str.charAt(i);
			} else if (Character.isDigit(ch)) {
				sum += Character.getNumericValue(ch);
			} else if (Character.isLowerCase(ch)) {
				LowerCaseOutput += str.charAt(i);
			}
		}
		NumSumOutput = String.valueOf(sum);
		return UpperCaseOutput + NumSumOutput + LowerCaseOutput;
	}

}
