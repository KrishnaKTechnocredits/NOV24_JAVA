/* 
On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5. */

package nikita.loopsdemo;

public class Assignment14 {
	
	void sumofNum(int startRange, int endRange) {
		int sum = 0, count = 0;
		for (int num=startRange; num<=endRange; num++) {
			if(num%3==0 && num%5 == 0) {
			sum = sum + num;
			count++;	
		}
	}
		System.out.println("Between range " + startRange + " to " + endRange + ", calculated sum is " + sum + ".");
		System.out.println("Between range " + startRange + " to " + endRange + ", there are total " + count + " numbers which are divisible by 3 & 5. ");
	
	}

	public static void main(String[] args) {
		Assignment14 a14 = new Assignment14();
		a14.sumofNum(1, 70);
	}


}
