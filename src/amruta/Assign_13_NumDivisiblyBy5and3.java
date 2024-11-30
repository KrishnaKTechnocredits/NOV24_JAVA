/*
 * Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
 */

package amruta;

public class Assign_13_NumDivisiblyBy5and3 {
	
	void printNumberDivisibleBy5and3(int startRange, int endRange) {
		for(int num = startRange; num <= endRange; num++) {
			if(num % 3 == 0 && num % 5 == 0)
				System.out.println(num + " is Divisible By 3 & 5");			
		}
	}
	
	public static void main(String[] args) {
		Assign_13_NumDivisiblyBy5and3 a13 = new Assign_13_NumDivisiblyBy5and3();
		a13.printNumberDivisibleBy5and3(5, 40);
	}
}
