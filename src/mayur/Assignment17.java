/*
 * Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480
 */

package mayur;

public class Assignment17 {
	
	void checkDivisibility(int num1, int num2) {
		System.out.println("Last 5 numbers divisible by 5 between "+num1+" and "+num2+" are -");
		int count=0;
		for(;num2>=num1;num2--) {
			if (num2%5==0) {
				count++;
				System.out.println(num2);
				if (count==5) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assign17 = new Assignment17();
		assign17.checkDivisibility(10, 500);
	}
}
