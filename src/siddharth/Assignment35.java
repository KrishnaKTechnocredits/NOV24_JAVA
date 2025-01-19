package siddharth;

//return "Upper" if uppercase frequency is higher than lowercase frequency other return "lower".
//if both having same freqency then return "same".
//input : teChnOcreDits  output : lower

public class Assignment35 {

	int uCount = 0;
	int lCount = 0;

	void getCharFreq(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isUpperCase(ch)) {
				uCount++;
			} else if (Character.isLowerCase(ch)) {
				lCount++;
			}

		}
	}

	void getCaseCount(String str) {
		getCharFreq(str);
		System.out.println("Input : " + str);
		if (uCount > lCount) {
			System.out.println("Output : Upper");
		} else if (lCount > uCount) {
			System.out.println("Output : Lower");
		} else {
			System.out.println("Output : Same");
		}
	}

	public static void main(String[] args) {
		Assignment35 assignment35 = new Assignment35();
		assignment35.getCaseCount("teChnOcreDits");
	}

}
