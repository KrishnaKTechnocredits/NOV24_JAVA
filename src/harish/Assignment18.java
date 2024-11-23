package harish;

/**
 * Assignment 18 | Nov 23 - On user defined range print return the last numbers
 * which is divisible by 5 and print the answer in main method.
 * 
 * Time taken - 7 minutes
 */

public class Assignment18 {

	int getLastNumDivisibleByFive(int startRange, int EndRange) {
		for (int i = EndRange; i >= startRange; i--) {
			if (i % 5 == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		int lastNumDivisibleByFive = assignment18.getLastNumDivisibleByFive(1, 498);
		if (lastNumDivisibleByFive == 0) {
			System.out.println("There is no such number which is divisible by 5 in the given range.");
		} else {
			System.out.println(
					lastNumDivisibleByFive + " is the last number which is divisible by 5 in the given range.");
		}
	}
}
