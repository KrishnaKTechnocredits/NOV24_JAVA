package sachin;

class Assignment12 {

	void printData(int startRange, int endRange) {

		for (int num = startRange; num <= endRange; num++) {
			if (num % 2 == 0) {

				System.out.println("Even numbers is : " + num);
			}
		}
	}

	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.printData(10, 15);

	}
}