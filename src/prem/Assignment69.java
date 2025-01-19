package prem;

public class Assignment69 {

	void printFreqOfEachWord(String str) {
		String[] words = str.split(" ");

		for (int i = 0; i < words.length; i++) {
			int count = 0;
			String letter = words[i];
			for (int j = 0; j < words.length; j++) {
				String letter2 = words[j];
				if (letter.equals(letter2)) {
					count++;
					words[i] = " ";
					words[j] = " ";
				}
			}
			if (letter != " ") {
				System.out.println(letter + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi Hello Hi Hi Hi Techno Credits Techno";
		Assignment69 assign69 = new Assignment69();
		assign69.printFreqOfEachWord(str);
	}
}
