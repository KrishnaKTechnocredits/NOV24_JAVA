package pratik;

public class EvenNum {
	void printEvenNum(int startRange, int endRange) {
		System.out.println("Even numbers in normal order:");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	void printEvenNumReverse(int endRange, int startRange) {
		System.out.println("Even numbers in reverse order:");
		for (int num = endRange; num >= startRange; num--) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
	}

	public static void main(String[] args) {
		EvenNum e = new EvenNum();
		e.printEvenNum(15, 20);
		e.printEvenNumReverse(20, 15);
	}

}
