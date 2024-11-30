package narendra;
/*
Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480
*/

public class Assignment_17_ToPrintNumInReverse {
	
	void getNumInReverse(int startRange, int endRange, int enterDivNum, int enterInput) {
		int countDivNum = 0;
		System.out.println("Last " + enterInput + " numbers divisible by " + enterDivNum + " are:");
		
		for(int num=endRange; num>=startRange; num--) {
			if(num % enterDivNum == 0) {
				int divNum = num;
				System.out.println(divNum);
				countDivNum++;
				if(countDivNum == enterInput) {
					break;
				}
			}			
		}
	}

	public static void main(String[] args) {
		Assignment_17_ToPrintNumInReverse printnuminreverse = new Assignment_17_ToPrintNumInReverse();
		printnuminreverse.getNumInReverse(10, 500, 5, 5);

	}

}