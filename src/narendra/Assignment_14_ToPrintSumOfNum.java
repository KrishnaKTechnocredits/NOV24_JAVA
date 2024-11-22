package narendra;
/*
Assignment - 14 : 21st Nov'2024 [15 mins]

On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 70
Output : In the range 1 to 70, calculated sum of numbers which are divisible by 3 and 5 is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
*/

public class Assignment_14_ToPrintSumOfNum {
	
	void getNumDivBy(int startRange, int endRange, int divNum1, int divNum2) {
		int sumOfDivNum = 0;
		int countDivNum = 0;
		System.out.println("In the range of " + startRange + " to " + endRange + ", divisible by " + divNum1 + " & " + divNum2 + ", numbers are:");
		
		for(int num=startRange; num<=endRange; num++) {
			if(num % divNum1 == 0 && num % divNum2 == 0) {
				int divNum = num;
				sumOfDivNum = sumOfDivNum + divNum;
				countDivNum++;
				System.out.println(divNum);
			}
			
		}
		System.out.println("\n" + "In the range of " + startRange + " to " + endRange + ", calculated sum of numbers which are divisible by " + divNum1 + " & " + divNum2 + " is: " + sumOfDivNum);
		System.out.println("\n" + "In the range of " + startRange + " to " + endRange + ", " + countDivNum + " numbers are divisible by " + divNum1 + " & " + divNum2 );
						
	}	

	public static void main(String[] args) {
		Assignment_14_ToPrintSumOfNum printNumDivBy = new Assignment_14_ToPrintSumOfNum();
		printNumDivBy.getNumDivBy(1, 70, 3, 5);

	}

}