package pranita;

public class Assignment33 {

	public int getFreqOfEachChar(String str, char ch) {

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (ch == str.charAt(i)) {
				count++;
			}
		}
		System.out.println(ch + " == " + count);
		return count;
	}

	public void getUpperChar(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isUpperCase(str.charAt(i)) && i == str.indexOf(ch)) {

				getFreqOfEachChar(str, ch);

			}
		}
	}

	public static void main(String[] args) {
		Assignment33 Assignment33 = new Assignment33();
		Assignment33.getUpperChar("aaKaNKshA");
	}

}
