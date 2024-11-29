package mousumi.AssignmentsInLoop;

/**
 Assignment - 14 : 21st Nov'2024 [15 mins]
On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 70
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5. 
 */

public class Divisibleby2NumAssignment14 {
	public static void main(String[] args) {
		Divisibleby2NumAssignment14 Divisibleby2 = new Divisibleby2NumAssignment14();
		Divisibleby2.division(1, 70);;
	}
	void division(int StartRange, int EndRange) {
		int count=0, sum=0 ;
		for (int num = StartRange; num <= EndRange; num++) {
			if (num % 5 == 0 && num % 3 == 0) {
				count++;
				sum = sum + num;
			}
		}
		System.out.println("In range between " +StartRange+ " to " +EndRange+" "
			                                     	+ "calculated sum is :"+sum);
		System.out.println("In range between " +StartRange+ " to " +EndRange+
				                          ","+count+" number are dividible by 3 and 5");
	}
}
