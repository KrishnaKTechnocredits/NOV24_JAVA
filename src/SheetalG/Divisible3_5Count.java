/*Assignment - 14 : 21st Nov'2024 [15 mins]

On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.*/

package SheetalG;

public class Divisible3_5Count {

	int numTotal, count;

	void divisible(int num1,int num2) {
		for(int num = num1;num <= num2;num++) {
			if (num%5==0 && num %3==0) {
			numTotal = numTotal + num; 
			count++;
			}
		}	
		System.out.println("In the range"+ num1 +" to "+ num2+" ,calculated sum is " +numTotal);
		System.out.println("In the range"+ num1 +" to "+ num2+ ", "+ count +" are divisible number by 3 &5");
	   }

	public static void main(String[] args){
		Divisible3_5Count divisible3_5Count = new Divisible3_5Count();
		divisible3_5Count.divisible(1,70);
	}

}
