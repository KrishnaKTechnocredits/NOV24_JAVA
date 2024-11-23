package narendra;
/*
Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
*/

public class Assignment_15_ToPrintFirst3Nos {
	
	void getFirst3DivNos(int startRange, int endRange, int divNum1, int divNum2, int enterInput) {
		int countDivNum = 0;
		System.out.println("In the range of " + startRange + " to " + endRange + ", First " + enterInput + " numbers divisible by " + divNum1 + " & " + divNum2 + " are:");
		
		for(int num=startRange; num<=endRange; num++) {
			if(num % divNum1 == 0 && num % divNum2 == 0) {
				int divNum = num;
				countDivNum++;
				System.out.println(divNum);
				if(countDivNum == enterInput) {
					break;
				}
			}
			
		}						
	}	

	public static void main(String[] args) {
		Assignment_15_ToPrintFirst3Nos printFirst3Nos = new Assignment_15_ToPrintFirst3Nos();
		printFirst3Nos.getFirst3DivNos(10, 500, 3, 4, 3);

	}

}