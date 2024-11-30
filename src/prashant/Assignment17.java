/*Assignment - 17 : 22nd Nov'2024 [20 mins] 8 min
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480*/
package prashant;

public class Assignment17 {

	void printLastNumbers(int startRange, int endRange) {
		System.out.println("Last 5 numbers divisible by 5 is :");
		int count = 0;
		for (int num = endRange; num >= startRange; num--) {
			if (num % 5 == 0) {
				System.out.println(num);
				count++;
				if (count == 5)
					break;
			}
		}

	}

	public static void main(String[] args) {

		Assignment17 assignment17 = new Assignment17();
		assignment17.printLastNumbers(10, 500);
	}

}
