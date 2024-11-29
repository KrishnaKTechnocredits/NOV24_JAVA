package mousumi.AssignmentsInLoop;

/**
Assignment - 12 : 21st Nov'2024 [12-15 mins]

Write only one program having the following methods.

1. print all even numbers in a user defined range.
Hint : pass start and end index as a parameter.

Input : Range -> 10 to 15
Output : Even numbers are:
10
12
14

*/

public class EvenNumbersAssignment12 {
	
	 void evenNum(int start,int end) {
		for(int num = start;num<=end;num++) {
			if(num%2==0) {
				System.out.println(num);
			}
		}
	}
	public static void main(String[] args) {
		EvenNumbersAssignment12 evenNumbers = new EvenNumbersAssignment12();
		System.out.println("Even Numbers are");
		evenNumbers.evenNum(2, 15);
	}


}
