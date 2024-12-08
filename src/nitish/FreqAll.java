package nitish;

public class FreqAll {

	void frequency1(String input) {
		for (int i = 0; i < input.length(); i++) {
			char c1 = input.charAt(i);
			// System.out.println(c1);
			if (input.indexOf(c1) == i) {
			frequency2(input, c1);
			}
		}
	}

	void frequency2(String input2, char c2) {
		int count = 0;
		for (int j = 0; j < input2.length(); j++) {
			if (input2.charAt(j) == c2) {
				count++;
			}
		}
		System.out.println(c2 + " ---> " + count);
	}

	public static void main(String[] args) {
		FreqAll obj = new FreqAll();
		obj.frequency1("Nitish Mehta");

	}

}
