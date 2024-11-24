package harish.loopsdemo;

/**
 * Assignment 14 | 21 Nov - On user defined range print sum of all the number
 * which is divisible by 3 & 5, and print count of numbers too.
 * 
 * Time taken - 7  minutes
 */

public class Assignment14 {

	void printSum(int startRange, int endRange) {
		int sum = 0;
		int count = 0;
		for (int i = startRange; i <= endRange; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum += i;
				count++;
			}
		}
		System.out.println("In the range " + startRange + " to " + endRange + " , calculated sum is " + sum);
		System.out.println(
				"In the range " + startRange + " to " + endRange + " , " + count + " numbers are divisible by 3 & 5");
	}

	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printSum(1, 70);
	}
}