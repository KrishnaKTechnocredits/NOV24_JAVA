package prem;

public class Assignment104 {

	void checkArmstromeNum(int num1) {
		int num = num1;
		int sum = 0;
		while (num != 0) {
			int digit = num % 10;
			int cube = digit * digit * digit;
			sum = sum + cube;
			num = num / 10;
		}
		if (num1 == sum) {
			System.out.println(num1 + " is a armstrome number");
		} else {
			System.out.println(num1 + " is not a armstrome number");
		}
	}

	public static void main(String[] args) {
		Assignment104 assign104 = new Assignment104();
		int num = 153;
		assign104.checkArmstromeNum(num);
	}
}
