package anuja;

public class Assignment14 {
/*
On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.
Input : Range -> 1 to 60
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5*/
	
	public void printSumOfNumbersWhichDevisBy3And5(int startNum, int lastNum) {
		int count = 0;
		int sumOfAllDivisibleNum = 0;
		System.out.println("\n"); //added separator

		//first we check if its divisible or not
		
		for(; startNum<=lastNum;startNum++) {

			//check if every iterated number is divisible by 3 and 5 or not.
			if(startNum%3 ==0  && startNum%5==0) {
				count = count + 1; // increase the count always if condition is true.
				sumOfAllDivisibleNum = sumOfAllDivisibleNum + startNum; //add into num if condition true
			}
		}
		System.out.println("In the range " +startNum+ " to " +lastNum+", calculated sum of all numbers whihc are deivisible by 3 and 5 is " +sumOfAllDivisibleNum+ " . \n");
		System.out.println("In the range " +startNum+ " to " +lastNum+" , "+count+ " numbers are devisible by 3 and 5 both. \n" );

	}
	
	public static void main(String [] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printSumOfNumbersWhichDevisBy3And5(1, 70);
	}
	
	
}
