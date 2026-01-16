package vrushali.arrayProgram;

//Assignment - 67 : 23rd Dec (IMP) [15 mins]
//Rearrange the given String, uppercase followed by digits followed by lowercase.
//
//input : Te1ch6NOCre3dits
//output : TNOC163echredits

public class RearrangeStringCharacterDigit67 {

	String reArrangeString(String str) {
		String outputStr = "";
		String upperCaseStr = "";
		String lowerCaseStr = "";
		String digitStr = "";

		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				digitStr = digitStr + str.charAt(i);
			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCaseStr = upperCaseStr + str.charAt(i);
			} else if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseStr = lowerCaseStr + str.charAt(i);
			}

		}
		outputStr = upperCaseStr + digitStr + lowerCaseStr;
		return outputStr;
	}

	public static void main(String[] args) {
		RearrangeStringCharacterDigit67 rearrangeStringCharacterDigit67 = new RearrangeStringCharacterDigit67();
		String inputStr = "Te1ch6NOCre3dits";
		String outputStr = rearrangeStringCharacterDigit67.reArrangeString(inputStr);
		System.out.println("Input String :--> " + inputStr);
		System.out.println("Output String :-->" + outputStr);
	}

}
