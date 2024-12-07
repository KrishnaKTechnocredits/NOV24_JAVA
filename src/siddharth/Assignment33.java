package siddharth;

//Assignment32: Find frequency of each character in the input string, input : aakanksha, hint : charAt , indexOf

public class Assignment33 {
	int getCharFreq(String str, char ch) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		return count;
	}

	void printCharFreq(String str) {
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int index = str.indexOf(ch);
			if (i == index && Character.isUpperCase(ch)) {
				int freq = getCharFreq(str, ch);
				System.out.println(ch + " > " + freq);
			}
		}
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		assignment33.printCharFreq("AABcBBBAdeddd");
	}

}