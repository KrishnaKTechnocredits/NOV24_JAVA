package pratik;

public class Assignment13 {
	void printNum(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.println("Number is divisible by 5 and 3 :" + " " + num);
			}
		}
	}

	public static void main(String[] args) {
		Assignment13 a = new Assignment13();
		a.printNum(5, 40);
	}

}
