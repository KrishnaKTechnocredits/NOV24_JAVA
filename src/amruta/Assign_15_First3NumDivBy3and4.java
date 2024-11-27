/*
 * Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
 */
package amruta;

public class Assign_15_First3NumDivBy3and4 {
	int count = 0;

	void printFirst3NumDivBy3and4(int startRange, int endRange) {
		System.out.println("First 3 Number Divisible by 3 & 4 are : ");
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				count++;
				System.out.println(num);
			}
			if (count == 3)
				break;
		}
	}

	public static void main(String[] args) {
		Assign_15_First3NumDivBy3and4 a15 = new Assign_15_First3NumDivBy3and4();
		a15.printFirst3NumDivBy3and4(10, 500);
	}
}
