/* 1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30 */


package nikita.loopsdemo;

public class Assignment13 {

	void printOddNumbers (int startNumber, int endNumber) {
		System.out.println("Numbers which are divisible by 5 & 3 in the range between " + startNumber + " & " + endNumber + ":");
		for (int i = startNumber; i <= endNumber; i++) {
			if (i%5 == 0 && i%3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment13 a13 = new Assignment13();
		a13.printOddNumbers(5, 50);

	}

}
