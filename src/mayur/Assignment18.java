/*
 * Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.
 */

package mayur;

public class Assignment18 {
	
	int checkDivisibility(int num1, int num2) {
		int count=0;
		for(;num2>=num1;num2--) {
			if (num2%5==0) {
				count++;
				if (count==1) {
					break;
				}
			}
		}
		if (count==1) {			
			return num2;
		}else {
			System.out.println("No number was disvisible by 5 in the given range, RETURNING value 0 !");
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Assignment18 assign18 = new Assignment18();
		int num = assign18.checkDivisibility(10, 498);
		System.out.println(num + " is the last number which is div by 5 in the given range.");
	}
}
