package harish;

/**
 * Assignment 13 - On user defined range print all numbers which are divisible
 * by 5 and divisible by 3.
 */

public class Assignment13 {

	void printNumberDivisibleByFiveAndThree(int startRange, int endRange) {
		System.out.println("Numbers which are divisible by 5 and 3 in the range " + startRange + " and " + endRange);
		for (; startRange <= endRange; startRange++) {
			if (startRange % 5 == 0 && startRange % 3 == 0) {
				System.out.println(startRange);
			}
		}
	}

	public static void main(String[] args) {
		Assignment13 assignment13 = new Assignment13();
		assignment13.printNumberDivisibleByFiveAndThree(1, 50);
	}
}
