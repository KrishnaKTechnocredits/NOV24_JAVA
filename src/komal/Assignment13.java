package komal;
/*Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30*/

public class Assignment13 {

	void getdivisibleNumbers(int startRange, int endRange) {
		System.out.println("Numbers which are divisible by 5 and 3 : ");
		for (int i = startRange; i <= endRange; i++) {
			if (i % 5 == 0 && i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {

		Assignment13 assignment13 = new Assignment13();
		assignment13.getdivisibleNumbers(1, 100);
	}
}
