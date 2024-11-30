package narendra;
/*
Assignment - 13 : 20th Nov'2024 [20 mins]

1. On user defined range print all numbers which are divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.

Input : Range -> 5 to 40a
Output : Divisible by 5 & 3, numbers are:
15
30
*/

public class Assignment_13_ToPrintNumDivisibleBy5And3 {
	
	void getNumDivBy5And3(int startRange, int endRange) {
		System.out.println("Divisible by 5 & 3, numbers are:");
		
		for(int num=startRange; num<=endRange; num++) {
			if(num %5== 0 && num %3== 0) {
				int divNum = num;
				System.out.println(divNum);
			}
			
		}
						
	}	

	public static void main(String[] args) {
		Assignment_13_ToPrintNumDivisibleBy5And3 printNumDivBy5And3 = new Assignment_13_ToPrintNumDivisibleBy5And3();
		printNumDivBy5And3.getNumDivBy5And3(5, 40);

	}

}