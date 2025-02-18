/*
1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40
Output : Divisible by 5 & 3, numbers are:
15
30
 */
package nitesh.loop;

class DivisibleByFiveThree{

	void printNumber(int startRange, int endRange){
		for(int num = startRange;num <=endRange;num++ ){
			if(num%5 == 0 && num%3 ==0){
				System.out.println("Divisible by 5 & 3, numbers are: "+ num);
			}
		}
	}
	public static void main(String[] args){
		DivisibleByFiveThree divisiblebyfivethree = new DivisibleByFiveThree();
		divisiblebyfivethree.printNumber(5,40);
	}
}