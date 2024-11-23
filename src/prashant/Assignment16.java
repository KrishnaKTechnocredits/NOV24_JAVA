/*Assignment - 16 : 22nd Jun'2024 [25 mins]--15 min
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70*/

package prashant;

public class Assignment16 {

	void printSumAvg(int startRange, int endRange) {
		int count = 0;
		int sum = 0;

		System.out.println("numbers are :");

		for (int num = startRange; num <= endRange; num++) {
			if (num % 5 == 0 && num % 7 == 0) {
				System.out.println(num);
				sum = sum + num;
				count++;
				if (count == 3)
					break;
			}
		}
		System.out.println("found " + count + " numbers which are divible by 5 & 7");
		System.out.println("sum " + "=" + sum);
		int average = sum / count;
		System.out.println("Average " + "= " + average);

	}

	public static void main(String[] args) {

		Assignment16 assignment16 = new Assignment16();
		assignment16.printSumAvg(1, 210);

	}

}
