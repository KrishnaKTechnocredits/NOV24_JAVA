package prem;

public class Assignment60 {

	int secMaxNum(int[] input) {
		int maxNum = input[0];
		int secMaxNum = input[1];

		for (int i = 0; i <= input.length - 1; i++) {
			if (maxNum < input[i]) {
				maxNum = input[i];
			} else if (secMaxNum < input[i]) {
				secMaxNum = input[i];

			}
		}
		return secMaxNum;
	}

	public static void main(String[] args) {
		Assignment60 assign60 = new Assignment60();
		int[] input = { 33, 33, 19, 55, 53, 11 };
		int secMaxNum = assign60.secMaxNum(input);
		System.out.println(secMaxNum);
	}

}
