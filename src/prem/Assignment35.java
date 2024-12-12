package prem;

public class Assignment35 {

	String upperLowerFreq(String str) {
		int lCount = 0;
		int uCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
				uCount++;
			} else if (Character.isLowerCase(ch)) {
				lCount++;
			}

		}
		if (uCount > lCount) {
			return "Upper";
		} else if (lCount > uCount) {
			return "Lower";
		} else
			return "Same";
	}

	public static void main(String[] args) {
		Assignment35 assign35 = new Assignment35();
		String ans = assign35.upperLowerFreq("teChnOcreDits");
		System.out.println(ans);
	}

}
