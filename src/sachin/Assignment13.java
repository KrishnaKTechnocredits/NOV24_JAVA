package sachin;

public class Assignment13 {

	void printNumberDivisible(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 5 == 0)
				System.out.println(num + " is Divisible By 3 & 5");
		}
	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.printNumberDivisible(5, 40);
	}
}
