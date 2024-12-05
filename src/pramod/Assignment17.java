/*
Assignment - 17 : 22nd Nov'2024 [10 mins]
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
package pramod;

class Assignment17 {
	
	void printLastFiveDivBy(int startRange, int endRange) {
		int sum = 0, count=0;
		System.out.println("Last 5 numbers divisible by 5 is: ");
		for(int index = endRange; index >= startRange; index--) {
			if(index%5==0) {
				System.out.println(index);
				count++;
				sum = sum +index;
			}
			if(count == 5) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 lastfive = new Assignment17();
		lastfive.printLastFiveDivBy(10,500);
	}
}