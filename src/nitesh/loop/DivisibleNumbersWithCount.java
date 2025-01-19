/*
On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
 */
package nitesh.loop;

public class DivisibleNumbersWithCount {
	int sum;
	int count;

	void printNumber(int startRange , int endRange){
		for(int i = startRange;i <=endRange; i++){
			if(i% 5 == 0 && i% 3==0){
				sum = sum + i;
				count++;
			}
		}
		System.out.println("In the range 1 to 60, calculated sum is "+ sum);
		System.out.println("In the range 1 to 60, " + count +" numbers are divisible by 3 and 5.");
	}
	public static void main(String [] args){
		DivisibleNumbersWithCount divisiblenumberswithcount = new DivisibleNumbersWithCount();
		divisiblenumberswithcount.printNumber(1,60);
	}
}
