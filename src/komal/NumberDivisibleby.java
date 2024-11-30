//Assignment - 15 : 22nd Nov'2024 [30-35 mins] ---------------------[MY time 20min]
//On user defined range print first 3 numbers which is divisible by 3 & 4.
//
//Hint : pass start and end index as a parameter.
//
//Input : Range -> 10 to 500
//Output : First 3 numbers divisible by 3 and 4 is :
//12
//24
//36

package komal;

public class NumberDivisibleby {

	void getDivisibleNumber(int num1, int num2) {

		int count = 0;
		System.out.println("First 3 numbers divisible by 3 and 4 is");
		for (int i = num1; i <= num2; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				count++;
				System.out.println(i);
				if (count == 3) {
					break;
				}
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberDivisibleby numberDivisibleby = new NumberDivisibleby();
		numberDivisibleby.getDivisibleNumber(10, 500);
	}

}
