//Print each char frequency in string using nested for loop

package harshada.Nestedloop;

public class CharFreq {

	void printCharFreq(String str) {
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (index == i) {
				for (int j = 0; j < str.length(); j++) {
					char currentch = str.charAt(j);
					if (ch == currentch) {
						count++;
					}
				}
				System.out.println(ch + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		charFreq.printCharFreq("aakanksha");
	}
}
