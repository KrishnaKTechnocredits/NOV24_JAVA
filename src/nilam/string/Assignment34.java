package nilam.string;
//print the frequency of all digit characters.
public class Assignment34 {
	int getDigitCount(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char chr = str.charAt(i);
			if (ch == chr) {
				count++;
			}
		}
		return count;
	}

	void getIndexCount(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				int index = getDigitCount(str, ch);
				if (i == str.indexOf(ch))
					System.out.println(ch + " -->" + index);
			}
		}
	}

	public static void main(String[] args) {
		Assignment34 assignment34 = new Assignment34();
		assignment34.getIndexCount("AAB2cBB2BAd2ed3dd");
	}
}
