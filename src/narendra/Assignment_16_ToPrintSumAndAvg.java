package narendra;
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

public class Assignment_16_ToPrintSumAndAvg {
	
	void getSumAndAvg(int startRange, int endRange, int divNum1, int divNum2, int enterInput) {
		int countDivNum = 0;
		int sumDivNum = 0;
		int avgDivNum;
		System.out.println("In the range of " + startRange + " to " + endRange + ", First " + enterInput + " numbers divisible by " + divNum1 + " & " + divNum2 + " are:");
		
		for(int num=startRange; num<=endRange; num++) {
			if(num % divNum1 == 0 && num % divNum2 == 0) {
				int divNum = num;
				System.out.println(divNum);
				countDivNum++;
				sumDivNum = sumDivNum + divNum;
				if(countDivNum == enterInput) {
					break;
				}
			}			
		}
		
		avgDivNum = sumDivNum/enterInput;
		System.out.println("\n" + "Found " + countDivNum + " numbers, which are divisible by " + divNum1 + " & " + divNum2 );
		System.out.println("\n" + "Sum is:" + sumDivNum);
		System.out.println("\n" + "Average is:" + avgDivNum);
	}	

	public static void main(String[] args) {
		Assignment_16_ToPrintSumAndAvg printsumandavg = new Assignment_16_ToPrintSumAndAvg();
		printsumandavg.getSumAndAvg(1, 210, 5, 7, 3);

	}

}