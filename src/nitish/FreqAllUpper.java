package nitish;

public class FreqAllUpper {

	void result1(String input1) {
		for (int i = 0; i < input1.length(); i++) {
			char c1 = input1.charAt(i);
			if (Character.isUpperCase(c1)) {
				// System.out.println(c1);
				if (input1.indexOf(c1) == i) {
					result2(input1, c1);
				}
			}
		}
	}

	void result2(String input2, char c2) {
		int count = 0;
		for (int j = 0; j < input2.length(); j++) {
			if (input2.charAt(j) == c2) {
				count++;
			}
		}
		System.out.println(c2 + "  ==>  " + count);
	}

	public static void main(String[] args) {
		FreqAllUpper upper = new FreqAllUpper();
		upper.result1("NiTisH mEhTA");

	}

}
