package prem;

public class Assignment53 {

	void printReverseNum(int[] input) {
		int[] output = new int[input.length];
		for (int i = input.length - 1, j = 0; i >= 0; i--, j++) {
			output[j] = input[i];
			System.out.println(output[j]);
		}
	}

	public static void main(String[] args) {
		Assignment53 assign53 = new Assignment53();
		int[] digit = { 10, 34, 22, 16, 19, 99 };
		assign53.printReverseNum(digit);
	}

}
