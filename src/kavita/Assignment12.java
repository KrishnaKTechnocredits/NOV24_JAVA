package kavita;

public class Assignment12 {
	void printEvenNumbers(int startRange, int endRange) {
		System.out.println("Even numbers between " + startRange + " and " + endRange);
		for(; startRange<=endRange; startRange++) {
			if (startRange % 2 == 0) {
				System.out.println(startRange);
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.printEvenNumbers(10, 18);
	}
}

