/*
 * Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
 */

package mayur;

public class Assignment13 {
	void checkDivisibility(int num1, int num2) {
		System.out.println("Numbers divisible by 5 & 3 between "+num1+" and "+num2+" are -");
		for(;num1<=num2;num1++) {
			if (num1%5==0 && num1%3==0) {
				System.out.println(num1);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment13 assign13 = new Assignment13();
		assign13.checkDivisibility(5, 40);
	}
}
