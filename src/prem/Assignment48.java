package prem;

public class Assignment48 {

	void printPositiveNum(int[] digit) {
		int count = 0;
		for (int i = 0; i < digit.length; i++) {
			int num = digit[i];
			if (num > 0) {
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Assignment48 assign48 = new Assignment48();
		int[] digit = { 10, 30, -45, 66, -10 };
		assign48.printPositiveNum(digit);

	}
}
