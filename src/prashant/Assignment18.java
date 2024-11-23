/*Assignment - 18 : 23rd Nov'2024 [20 mins] 10 min
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.*/


package prashant;

public class Assignment18 {

	int getLastDivNumber(int startIndex, int endIndex) {

		for (int num = endIndex; num >= startIndex; num--) {
			if (num % 5 == 0) {
				return num;

			}
		}

		return 0;

	}

	public static void main(String[] args) {

		Assignment18 assignment18 = new Assignment18();
		int ans = assignment18.getLastDivNumber(10, 498);
		System.out.println(ans + " is the last number which is div by 5 in the given range.");

	}

}
