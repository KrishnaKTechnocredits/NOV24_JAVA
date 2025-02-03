package vrushali.arrayProgram;

//Assignment - 68 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by sum of all the digits followed by lowercase.
//
//input : Te1ch6NOCre4dits
//output : TNOC11echredits
//
//int digitSum = 0;
//
//if(Character.isDigit(ch)){
//	digitSum += Character.getNumericValue(ch);
//}
//
//return uCaseStr + digitSum + lCaseStr;

public class RearrangeStringWithSumOfNum68 {

	String reArrangeString(String str) {
		String outputStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		int sumOfDigits = 0;

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {

				sumOfDigits = sumOfDigits + Character.getNumericValue(str.charAt(i));
			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCaseStr = upperCaseStr + str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseStr = lowerCaseStr + str.charAt(i);
			}

		}
		outputStr = upperCaseStr + sumOfDigits + lowerCaseStr;
		return outputStr;
	}

	public static void main(String[] args) {
		RearrangeStringWithSumOfNum68 rearrangeStringWithSumOfNum68 = new RearrangeStringWithSumOfNum68();
		String inputStr = "Te1ch6NOCre4dits";
		String outputStr = rearrangeStringWithSumOfNum68.reArrangeString(inputStr);
		System.out.println("Input String :--> " + inputStr);
		System.out.println("Output String :-->" + outputStr);
	}

}
