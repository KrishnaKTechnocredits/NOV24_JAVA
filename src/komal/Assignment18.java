//Assignment - 18 : 23rd Nov'2024 [20 mins] ----------------------[my time 15 min]
//On user defined range print return the last numbers which is divisible by 5 and print the answer in main method.
//
//int getLastDivNumber(int startIndex, int endIndex){
//
//}

package komal;

public class Assignment18 {

	int numberDivisibleby(int startRange, int lastRange) {
		int count = 0;
		for (int i = lastRange; i >= startRange; i--) {
			if (i % 5 == 0) {
				count++;
				if (count == 1) {
					return i;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		Assignment18 assignment18 = new Assignment18();
		int last_number = assignment18.numberDivisibleby(10, 498);
		System.out.println("The last numbers which is divisible by : " + last_number);
	}
}
