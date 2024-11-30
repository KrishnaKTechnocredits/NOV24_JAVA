package komal;

/*Assignment - 14 : 21st Nov'2024 [15 mins]

On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.*/

public class SumofNumber {

	void sumOfNumberDivisible(int startRange, int endRange) {
		int sum = 0;
		int countNumber = 0;
		for (int i = startRange; i <= endRange; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
				countNumber++;
			}
		}
		System.out.println("sum of number which is divisible by 3 and 5 is " + sum);
		System.out.println("count of number is " + countNumber);
	}

	public static void main(String[] args) {

		SumofNumber sumofNumber = new SumofNumber();
		sumofNumber.sumOfNumberDivisible(1, 70);
	}
}
