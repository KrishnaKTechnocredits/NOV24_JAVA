/*
 * Assignment - 16 : 22nd Jun'2024 [25 mins]
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70
 */
package amruta;

public class Assign_16_SumAndAvgOffirst3NumDivBy5and7 {
	static int sum = 0;
	static int avg = 0;
	static int count = 0;

	void printFirst3NumberDivisibleBy5and7(int startRange, int endRange) {
		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num + " is Divisible By 5 & 7");
				count++;
				sumOfNum(num);
			}
			if(count == 3)
				break;
		}
	}

	void sumOfNum(int num) {
		sum += num;
	}

	static void avgOfNum(int num) {
		avg = sum / count;
	}

	public static void main(String[] args) {
		Assign_16_SumAndAvgOffirst3NumDivBy5and7 a16 = new Assign_16_SumAndAvgOffirst3NumDivBy5and7();
		a16.printFirst3NumberDivisibleBy5and7(1, 210);
		System.out.println("-------------------------------");
		System.out.println("Sum of First 3 Number divisible by 5 & 7 is  - "+sum);
		avgOfNum(count);
		System.out.println("Average of sum of First 3 Number divisible by 5 & 7 is  - "+avg);
	}
}
