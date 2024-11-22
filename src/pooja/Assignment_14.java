/*On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
*/
package pooja;

public class Assignment_14 {

	int sum;

	void sumDivisibleBY3and5(int start, int end) {
		System.out.println("The Numbers divisible by 3 and 5 are : ");
		for (int i = start; i <= end; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				sum = sum + i;
				System.out.println(i);
			}
		}
		System.out.println("The sum of all the numbers divisible by 3 ad 5 is : " + sum);
	}

	public static void main(String[] args) {
		Assignment_14 assignment_14 = new Assignment_14();
		assignment_14.sumDivisibleBY3and5(1, 60);
	}
}