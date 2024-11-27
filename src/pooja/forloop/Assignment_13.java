/*Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
*/
package pooja.forloop;

public class Assignment_13 {

	void divideBy3And5(int start, int end) {
		System.out.println("The Numbers divisible by 3 and 5 are : ");
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_13 assignment_13 = new Assignment_13();
		assignment_13.divideBy3And5(1, 100);
	}
}