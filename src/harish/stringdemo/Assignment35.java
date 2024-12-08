package harish.stringdemo;

/**
 * Assignment - 35 : 7th Dec [20 mins]
 * 
 * Return "Upper" if uppercase frequency is higher than lowercase frequency
 * other return "lower". if both having same freqency then return "same".
 */

public class Assignment35 {

	private String getResult(String str) {
		String result = "";
		int lowerCaseFreq = 0;
		int upperCaseFreq = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLowerCase(str.charAt(i))) {
				lowerCaseFreq++;
			} else if (Character.isUpperCase(str.charAt(i))) {
				upperCaseFreq++;
			}
		}
		if (lowerCaseFreq == upperCaseFreq) {
			result = "same";
		} else if (lowerCaseFreq > upperCaseFreq) {
			result = "lower";
		} else {
			result = "upper";
		}
		return result;
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		String input = "teChnOcreDits";
		System.out.println(assignment35.getResult(input));
	}
}
