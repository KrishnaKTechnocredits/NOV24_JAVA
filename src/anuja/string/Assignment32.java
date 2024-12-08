package anuja.string;

class Assignment32 {

	// Method to get the frequency of a specific character in a string--use it a common method always.
	public int getCharFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char currentChar = str.charAt(i);
			if (ch == currentChar) {
				count++;
			}
		}
		System.out.println(ch + "--" + count); // Print the frequency of the given character
		return count;
	}

	// Method to find  the frequency of all unique characters, avoiding
	// duplicates using indexof, it only take 1st occurrences.
	public void printFrequencyOfUniqueChars(String str) {
		for (int j = 0; j < str.length(); j++) {
			char ch1 = str.charAt(j);
			int index = str.indexOf(ch1);
			// Check if the current character's index matches its first occurrence in the
			// string
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
