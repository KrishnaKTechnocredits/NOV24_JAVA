/*
 * Assignment - 14 : 21st Nov'2024 [15 mins]

On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
 */

package mayur;

public class Assignment14 {
	
	void printSum(int startRange, int endRange) {
		int sum=0;
		int count=0;		
		for(int startRange_local=startRange;startRange_local<=endRange;startRange_local++) {
			if(startRange_local%3==0 && startRange_local%5==0) {
				sum=sum+startRange_local;
				count++;
			}
		}
		System.out.println("In the range "+startRange+" to "+endRange+", calculated sum is = "+sum);
		System.out.println("In the range "+startRange+" to "+endRange+" , "+count+" numbers are divisible by 3 and 5");
	}
	
	public static void main(String[] args) {
		Assignment14 assign14 = new Assignment14();
		assign14.printSum(1, 70);
	}
}
