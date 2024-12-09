package nitish;

public class FreqAllChar {

	void inputTaken(String input) {

		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char c = input.charAt(index);
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) == c) {
					count++;
				}
			}
			if (input.indexOf(c) == index) {
				System.out.println(c + " -- " + count);
			}
		}
	}

	public static void main(String[] args) {
		FreqAllChar freqAllChar = new FreqAllChar();
		String input = "Nitish Mehta";
		freqAllChar.inputTaken(input);
	}
}
