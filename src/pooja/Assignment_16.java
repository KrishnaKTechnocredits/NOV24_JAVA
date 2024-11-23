/*Assignment - 16 : 22nd Jun'2024 [25 mins]
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
package pooja;

public class Assignment_16 {

	void divBy5and7(int start, int end) {
		int count = 0, sum = 0, average = 0;
		System.out.println("The first 3 numbers which is divisible by 5 & 7 are : ");
		for (int i = start; i < end; i++) {
			if (i % 5 == 0 && i % 7 == 0) {
				System.out.println(i);
				count++;
				sum = sum + i;
			}
			if (count == 3) {
				average = sum / count;
				break;
			}
		}
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + average);
	}

	public static void main(String[] args) {
		Assignment_16 assignment_16 = new Assignment_16();
		assignment_16.divBy5and7(1, 210);
	}
}