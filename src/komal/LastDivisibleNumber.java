//Assignment - 17 : 22nd Nov'2024 [20 mins] ---------------------------------[My time - 10min]
//On user defined range print last 5 numbers which is divisible by 5.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : Last 5 numbers divisible by 5 is :
//500
//495
//490
//485
//480

package komal;

public class LastDivisibleNumber {

	void getLastDivisibleNumber(int num1, int num2) {

		int count = 0;
		System.out.println("Last 5 numbers which is divisible by 5 are : ");
		for (int i = num2; i <= num2; i--) {

			if (i % 5 == 0) {
				count++;
				System.out.println(i);
				if (count == 5) {
					break;
				}
			}

		}
	}

	public static void main(String[] args) {

		LastDivisibleNumber lastDivisibleNumber = new LastDivisibleNumber();
		lastDivisibleNumber.getLastDivisibleNumber(10, 500);
	}
}
