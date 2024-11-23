package harish;

/**
 * Assignment 17 | Nov 22 - On user defined range print last 5 numbers which is
 * divisible by 5.
 */

public class Assignment17 {

	void printLast5NumbersDivisibleBy5(int startRange, int endRange) {
		int count = 0;
		System.out
				.println("The last 5 numbers divisible by 5 in the range " + startRange + " to " + endRange + " are:");
		for (int i = endRange; i >= startRange; i--) {
			if (i % 5 == 0) {
				System.out.println(i);
				count++;

				if (count == 5) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printLast5NumbersDivisibleBy5(10, 500);
	}
}
