package swapnil;

public class Assignment69 {

	void findFreq(String line) {
		String[] words = line.split(" ");
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			if (!word.equals("")) {
				int count = 0;
				for (int j = 0; j < words.length; j++) {
					if (word.equals(words[j])) {
						words[j] = "";
						count++;
					}
				}
				System.out.println(word + "->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment69 a = new Assignment69();
		a.findFreq("Hi Hello Hi Hi Hi Techno Credits Techno");

	}

}
