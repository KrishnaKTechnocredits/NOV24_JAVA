/* Assignment - 16 : 22nd Jun'2024 [25 mins]
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

package nikita;

public class Assignment16 {
	
	void display(int startRange, int endRange) {
		int count = 0;
		int sum = 0;
		System.out.println("First 3 Numbers which are divisble by 5 & 7 are: ");
		for (int num = startRange; num<=endRange; num++) {
			if(num%5==0 && num%7==0) {
				System.out.println(num);
				sum = sum + num;
				count++;
				if (count==3) {
					break;
				}
			}
		}
		System.out.println("Sum & Average of first 3 numbers which are divisible by 5 & 7 in the range of " +
		startRange + " & " + endRange + " are: ");
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + sum/count);
	}

	public static void main(String[] args) {
		Assignment16 a16 = new Assignment16();
		a16.display(1, 210);
	}
}
