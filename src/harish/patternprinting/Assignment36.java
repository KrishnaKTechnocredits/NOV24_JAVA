package harish.patternprinting;

/**
 * Assignment - 36 : 8th Dec
 * 
 * Print table for 1 to 5 numbers.
 */

public class Assignment36 {

	void printTables(int startRange, int endRange) {
		for (int i = startRange; i <= endRange; i++) {
			System.out.println("Table for number " + i + ":");
			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Assignment36 assignment36 = new Assignment36();
		assignment36.printTables(1, 5);
	}
}