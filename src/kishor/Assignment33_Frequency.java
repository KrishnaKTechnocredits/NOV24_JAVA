package kishor;

public class Assignment33_Frequency {

	int getFrequency(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch1 = str.charAt(i);
			if (ch == ch1) {
				count++;
			}
		}
		return count;
	}

	void printUppercase(String str) {
		for (int k = 0; k < str.length(); k++) {
			char ch2 = str.charAt(k);
			int input = str.indexOf(ch2);
			if (k == input && Character.isUpperCase(ch2)) {
				Assignment33_Frequency assignment33 = new Assignment33_Frequency();
				int ans = assignment33.getFrequency(str, ch2);
				System.out.println(ch2 + "->" + ans);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33_Frequency assignment33 = new Assignment33_Frequency();
		assignment33.printUppercase("AABcBBBAdeddd");
	}
}
