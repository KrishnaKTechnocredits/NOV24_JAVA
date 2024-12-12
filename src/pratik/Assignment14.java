package pratik;

public class Assignment14 {
	int sum = 0;
	int count = 0;

	void printNumber(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				sum = sum + num;
				count++;
			}
		}
		System.out.println("Sum of the number which is divisible by 5 & 3 is : " + sum);
		System.out.println("The count of number which is divisible by 5 & 3 is : " + count);
	}

	public static void main(String[] args) {
		Assignment14 a = new Assignment14();
		a.printNumber(1, 70);
	}
}
