package kishor;

public class Assignment37_FrequencyLoopInsideLoop {

	void printFequency(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int count = 0;
			int input = str.indexOf(ch);
			if (i == input) {
				for (int k = 0; k < str.length(); k++) {
					char ch1 = str.charAt(k);
					if (ch == ch1) {
						count++;
					}
				}
				System.out.println(ch + "->" + count);
			}
		}
	}

	public static void main(String[] args) {
		Assignment37_FrequencyLoopInsideLoop assignment37 = new Assignment37_FrequencyLoopInsideLoop();
		assignment37.printFequency("aakanksha");
	}
}
