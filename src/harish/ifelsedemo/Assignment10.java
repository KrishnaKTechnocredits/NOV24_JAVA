/**
 * 
 */
package harish.ifelsedemo;

/**
 * Assignment - 10 : 18th Nov'2024
 * 
 * Please use nested if else for below requirement.
 * 
 * Based on month index, print quarter and name of the month.
 */
public class Assignment10 {

	void printQuarterAndMonthName(int index) {

		if (index < 1) {
			System.out.println("Invalid month index, it can't be less than 1.");
		} else if (index >= 1 && index <= 3) {

			if (index == 1) {
				System.out.println("Month index " + index + " is in Q1. Its January.");
			} else if (index == 2) {
				System.out.println("Month index " + index + " is in Q1. Its February.");
			} else {
				System.out.println("Month index " + index + " is in Q1. Its March.");
			}
		} else if (index >= 4 && index <= 6) {

			if (index == 4) {
				System.out.println("Month index " + index + " is in Q2. Its April.");
			} else if (index == 5) {
				System.out.println("Month index " + index + " is in Q2. Its May.");
			} else {
				System.out.println("Month index " + index + " is in Q2. Its June.");
			}
		} else if (index >= 7 && index <= 9) {

			if (index == 7) {
				System.out.println("Month index " + index + " is in Q3. Its July.");
			} else if (index == 8) {
				System.out.println("Month index " + index + " is in Q3. Its August.");
			} else {
				System.out.println("Month index " + index + " is in Q3. Its September.");
			}
		} else if (index >= 10 && index <= 12) {

			if (index == 10) {
				System.out.println("Month index " + index + " is in Q4. Its October.");
			} else if (index == 11) {
				System.out.println("Month index " + index + " is in Q4. Its November.");
			} else {
				System.out.println("Month index " + index + " is in Q4. Its December.");
			}
		} else {
			System.out.println("Invalid month index, it can't be greater than 13.");
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Assignment10 assignment10 = new Assignment10();
		assignment10.printQuarterAndMonthName(5);
		assignment10.printQuarterAndMonthName(2);
		assignment10.printQuarterAndMonthName(-3);
		assignment10.printQuarterAndMonthName(13);
	}
}