/*Assignment - 15 : 22nd Nov'2024 [30-35 mins]----15 Min
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36*/

package prashant;

public class Assignment15 {

	void printFirstNumbers(int startRange, int endRange) {
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		int count = 0;
		for (int num = startRange; num <= endRange; num++) {
			if (num % 3 == 0 && num % 4 == 0) {
				System.out.println(num);
				count++;
				if (count == 3)

					break;
			}
		}

	}

	public static void main(String[] args) {

		Assignment15 assignment15 = new Assignment15();
		assignment15.printFirstNumbers(10, 500);

	}

}
