/*
 * Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480
 */
package amruta;

public class Assign_17_PrintLast5NumDivisibleBy5 {
	static int count = 0;

	void PrintLast5NumDivisibleBy5(int startRange, int endRange) {
		for (int num = endRange; num > startRange; num--) {
			if (num % 5 == 0) {
				System.out.println(num);
				count++;
			}
			if (count == 5)
				break;
		}
	}

	public static void main(String[] args) {
		Assign_17_PrintLast5NumDivisibleBy5 a17 = new Assign_17_PrintLast5NumDivisibleBy5();
		System.out.println("Last 5 Number divisible by 5 are :");
		a17.PrintLast5NumDivisibleBy5(10, 500);
	}
}
