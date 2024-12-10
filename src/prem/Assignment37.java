package prem;

public class Assignment37 {
	
	void freqOfChar(String str) {
		for (int i = 0; i <= str.length() - 1; i++) {
			int count = 0;
			char ch = str.charAt(i);
			int currentChar = str.indexOf(ch);
			if (currentChar == i) {
				for (int j = 0; j < str.length(); j++) {
					if (ch == str.charAt(j)) {
						count++;
					}
				}
				System.out.println(str.charAt(i) + ": " + count);
			}

		}
	}

	public static void main(String[] args) {
		Assignment37 assign37 = new Assignment37();
		assign37.freqOfChar("aakanksha");

	}
}
