/*
 Assignment - 16 : 22nd Jun'2024 [25 mins]
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70
 */

package nitesh.loop;

class SumAvarageThree{
	int sum;
	int avg;
	int count;

	void printSumAverageThree(int startRange, int endRange){
		for(int i = startRange;i<=endRange;i++){
			if(i%5 ==0 && i%7==0){
				count++;
				sum = sum +i;
				System.out.println("First three Number are :" +i);
				if(count==3){
					break;
				}
			}
		}
		avg = sum/3;
		System.out.println("Average of First three Number are :" +avg);
		System.out.println("Sum of First three Number are :" +sum);
	}
	public static void main(String[] args){
		SumAvarageThree sumaveragethree = new SumAvarageThree();
		sumaveragethree.printSumAverageThree(1,210);
	}
}