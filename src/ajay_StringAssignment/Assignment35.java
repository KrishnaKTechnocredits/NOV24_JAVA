/*
Assignment - 35 : 7th Dec [20 mins]
return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
if both having same freqency then return "same".

input : teChnOcreDits
output : lower
*/
package ajay_StringAssignment;

public class Assignment35 {

	int getUpperCaseCharFreq(String input) {
		int uCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isUpperCase(currentChar)) {
				uCount++;

			}
		}
		return uCount;
	}

	int getLowerCaseCharFreq(String input) {

		int lCount = 0;
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			if (Character.isLowerCase(currentChar)) {
				lCount++;
			}
		}
		return lCount;
	}

	String compareFreq(int uCount, int lCount) {
		if (uCount > lCount)
			return "upper";
		else if (lCount > uCount)
			return "lower";
		else
			return "same";
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "teChnOcreDits";
		assignment35.getUpperCaseCharFreq(input);
		int uCount = assignment35.getUpperCaseCharFreq(input);
		int lCount = assignment35.getLowerCaseCharFreq(input);
		String result = assignment35.compareFreq(uCount, lCount);
		System.out.println("Comparison Result : " + result);

	}

}
