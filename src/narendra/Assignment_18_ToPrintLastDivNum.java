package narendra;
/*
Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
*/

public class Assignment_18_ToPrintLastDivNum {
	
	int getLastDivNum(int startRange, int endRange, int enterDivNum) {
		int divNum = 0;
		for(int num=startRange; num<=endRange; num++) {
			if(num % enterDivNum == 0) {
				divNum = num;				
			}			
		}
		return divNum;
		
/*		for(int num=endRange; num>=startRange; num--) { // Another logic to print last div num
			if(num % enterDivNum == 0) {
				return num;			
			}			
		}
		
		return divNum;
*/
	}

	public static void main(String[] args) {
		Assignment_18_ToPrintLastDivNum printlastdivnum = new Assignment_18_ToPrintLastDivNum();
		int startRange = 10; 
		int endRange = 498;
		int enterDivNum = 5;
		int lastdivNum = printlastdivnum.getLastDivNum(startRange, endRange, enterDivNum);
		System.out.println(lastdivNum + " is the last number which is divisible by " + enterDivNum + " in the given range.");

	}

}