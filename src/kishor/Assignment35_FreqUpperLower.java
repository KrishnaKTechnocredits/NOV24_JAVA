package kishor;

public class Assignment35_FreqUpperLower {

	String getFrequency(String str) {
		int uCount = 0, lCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCount++;
			} else {
				lCount++;
			}
		}
		if (uCount > lCount) {
			return "UPPER";
		} else if (lCount > uCount) {
			return "LOWER";
		} else {
			return "SAME";
		}
	}

	public static void main(String[] args) {
		Assignment35_FreqUpperLower assignment35 = new Assignment35_FreqUpperLower();
		String ans = assignment35.getFrequency("teChnOcreDits");
		System.out.println(ans);
	}
}
