package pooja.stringassignments;

public class Assignment_34 {

	int getFreqChar(String str, char ch) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch)
				cnt++;
		}
		return cnt;
	}

	void getDigitCharFrequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (i == str.indexOf(str.charAt(i))) {
				if (Character.isDigit(str.charAt(i))) {
					int ans = getFreqChar(str, str.charAt(i));
					System.out.println(str.charAt(i) + " -> " + ans);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment_34 assignment_34 = new Assignment_34();
		assignment_34.getDigitCharFrequency("tech5no9c5re9di5t1");
	}
}