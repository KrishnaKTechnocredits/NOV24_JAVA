//Assignment - 16 : 22nd Jun'2024 [25 mins]   ----------------------------------[My Time 15min]
//On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 1 to 210
//Output : Numbers are,
//35
//70
//105
//Found 3 numbers which are divible by 5 & 7.
//sum = 210
//Average = 70

package komal;

public class SumAvgDivisibleNumber {

	void getsumAvgOfNumber(int num1, int num2) {
		int count = 0;
		int sum = 0;
		System.out.println("First 3 numbers divisible by 5 and 7 is : ");
		for (int i = num1; i <= num2; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				count++;
				sum = sum + i;
				System.out.println(i);
				if (count == 3) {
					break;
				}
			}
		}
		System.out.println("Total is : " + sum);
		System.out.println("Average is : " + sum / count);
	}

	public static void main(String[] args) {

		SumAvgDivisibleNumber sumAvgDivisibleNumber = new SumAvgDivisibleNumber();
		sumAvgDivisibleNumber.getsumAvgOfNumber(1, 210);
	}

}
