package mousumi.AssignmentsInLoop;

/**
 Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30

 */

public class DivisibleAssignment13 {
	
	void divisible5(int start,int end) {
		for(int num = start;num<=end;num++) {
			if(num%5==0 && num %3==0) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		DivisibleAssignment13 divisible = new DivisibleAssignment13();
		System.out.println("The numbers which are divisible by 5 and 3 are ");
		divisible.divisible5(5, 40);
	}
}
