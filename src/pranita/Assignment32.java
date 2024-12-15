package pranita;

class Assignment32 {

	public int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (ch == currentChar) {
				count++;
			}
		}
		System.out.println(ch + "--" + count); 
		return count;
	}

	public void printFrequencyOfUniqueChars(String str) {
		for (int j = 0; j < str.length(); j++) {
			char ch1 = str.charAt(j);
			int index = str.indexOf(ch1);
			if (j == index) {
				getCharFrequency(str, ch1);
			}
		}
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.printFrequencyOfUniqueChars("aAkansha");
	}
}
