/*Assignment - 18 : 23rd Nov'2024 [20 mins]
On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.

int getLastDivNumber(int startIndex, int endIndex){

}

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 498
Output : 495 is the last number which is div by 5 in the given range.*/package pooja;

public class Assignment_18 {

	int getLastDivNumber(int startIndex, int endIndex) {
		int num = 0;
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0) {
				num = i;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		Assignment_18 assignment_18 = new Assignment_18();
		int ans = assignment_18.getLastDivNumber(10, 498);
		System.out.println(ans + " is the last number which is div by 5 in the given range");
	}
}