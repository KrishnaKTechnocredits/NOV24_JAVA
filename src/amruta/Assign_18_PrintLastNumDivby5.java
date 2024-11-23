/*
 * Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
 */

package amruta;

public class Assign_18_PrintLastNumDivby5 {
	
	int returnLaastNumberDivBy5(int startNum, int endNum) {
		int num = endNum;
		for(; num >= startNum; num--) {
			if(num % 5 == 0) {
				break;
			}
		}
		return num;
	}
	
	public static void main(String[] args) {
		Assign_18_PrintLastNumDivby5 a16 = new Assign_18_PrintLastNumDivby5();
		int lastNum = a16.returnLaastNumberDivBy5(10, 498);
		System.out.println(lastNum + " is the last number which is div by 5 in the given range.");
	}
}
