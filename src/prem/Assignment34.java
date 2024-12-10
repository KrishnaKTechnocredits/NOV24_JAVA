package prem;

public class Assignment34 {

	void getDigitFreq(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			int index = str.indexOf(ch);
			if (Character.isDigit(ch)) {
				if (index == i) {
					for (int j = 0; j < str.length(); j++) {
						if (ch == str.charAt(j)) {
							count++;
						}
					}
					System.out.println(ch + "->" + count);
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment34 assign34 = new Assignment34();
		assign34.getDigitFreq("AAB2cBB2BAd2ed3dd");
	}

}
