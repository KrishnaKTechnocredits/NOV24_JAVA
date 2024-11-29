/*Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
*/

package pooja.forloop;

public class Assignment_15 {

	void divBy3And4(int start, int end) {
		int count = 0;
		System.out.println("The first 3 numbers divisible by 3 and 4 are : ");
		for (int i = start; i < end; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.println(i);
				count++;
				if (count == 3) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		Assignment_15 assignment_15 = new Assignment_15();
		assignment_15.divBy3And4(10, 500);
	}
}