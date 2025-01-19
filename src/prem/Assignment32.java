package prem;

public class Assignment32 {

	int getCharcount(String name, char ch) {
		int count = 0;
		for (int i = 0; i <= name.length() - 1; i++) {
			char chi = name.charAt(i);
			if (chi == ch) {
				count++;
			}
		}
		return count;
	}

	void eachCharFreq() {
		String name = "aakanksha";
		for (int j = 0; j < name.length(); j++) {
			char ch = name.charAt(j);
			int indexCount = getCharcount(name, ch);
			if (j == name.indexOf(ch)) {
				System.out.println(ch + ": " + indexCount);
			}
		}
	}

	public static void main(String[] args) {
		Assignment32 assign32 = new Assignment32();
		assign32.eachCharFreq();
	}
}
