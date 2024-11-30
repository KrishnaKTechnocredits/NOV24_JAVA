package swapnil;

public class Assignment18 {
	int startRange,endRange;
	static int num;
	
	int lastnum (int startRange, int endRange) {
		for(num=endRange;num>=startRange;num--) {
			if(num%5==0) {
			break;
			}
		}
	 return num;	
	}
	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		assignment18.lastnum(10,498);
		System.out.println(num+" is the last number which is div by 5 in the given range." );

	}
}




/*
Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
*/