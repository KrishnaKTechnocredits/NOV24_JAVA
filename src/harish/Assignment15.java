package harish;

/**
 * Assignment 15 | Nov 22 - On user defined range print first 3 numbers which is
 * divisible by 3 & 4.
 * 
 * Time Taken - 5 minutes
 */

public class Assignment15 {

	void printNumbersDivisibleBy3And4(int startRange, int endRange) {
		int count = 0;
		System.out.println("First 3 numbers which are divisible by 3 & 4 in the range " + startRange + " to "
				+ endRange + " are-");
		for (int i = startRange; i <= endRange; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				count++;
				if (count == 3) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.printNumbersDivisibleBy3And4(10, 500);
	}
}
