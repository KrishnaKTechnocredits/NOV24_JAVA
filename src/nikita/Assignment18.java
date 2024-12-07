/* Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.

*/

package nikita;

public class Assignment18 {
	
	int getLastDivNumber(int startIndex, int endIndex) {
		for (int i = endIndex; i>=startIndex; i--) {
			if(i % 5 == 0) {
				return i;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment18 a18 = new Assignment18();
		int lastNumberDivisibleByFive = a18.getLastDivNumber(10, 498);
		if (lastNumberDivisibleByFive == 0) {
			System.out.println("There is no such number which is divisible by 5 in the given range");
		}
		else {
			System.out.println(lastNumberDivisibleByFive + " is the last number which is divisible by 5 in the given range.");
		}
	}
}
