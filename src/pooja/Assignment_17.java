/*Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480*/
package pooja;

public class Assignment_17 {

	void divisibleBy5(int start, int end) {
		int count = 0;
		System.out.println("The Last 5 numbers divisible by 5 are : ");
		for (int i = end; i >=start; i--) {
			if (i % 5 == 0) {
				System.out.println(i);
				count++;
			}
			if (count == 5) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment_17 assignment_17 = new Assignment_17();
		assignment_17.divisibleBy5(10, 500);
	}
}