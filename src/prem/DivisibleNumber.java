package prem;

public class DivisibleNumber {

	void divisible(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		DivisibleNumber divisibleNumber = new DivisibleNumber();
		divisibleNumber.divisible(5, 40);
	}

}
