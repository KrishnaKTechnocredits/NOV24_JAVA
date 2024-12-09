package rushikesh.CharMethodAssignments;

public class Assignment_32 {

	void getCharFreqency(String str, char ch) {

		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char c = str.charAt(index);
			int d = str.indexOf(c);
			if (c == ch) {
				count++;
			}

		}
		System.out.println(ch + "->" + count);

	}

	void giveChar(String str1) {
		for (int i = 0; i < str1.length(); i++) {
			char d = str1.charAt(i);
			int index = str1.indexOf(d);
			if (index == i) {
				getCharFreqency(str1, d);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_32 assignment_32 = new Assignment_32();
		assignment_32.giveChar("technocredit");

	}
}
