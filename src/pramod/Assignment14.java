/*Assignment - 14 : 21st Nov'2024 [10 mins]

On user defined range print sum of all the number which is divisible by 3 & 5, and print count of numbers too.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 70
Output : In the range 1 to 70, calculated sum is 150
         In the range 1 to 70, 4 numbers are divisible by 3 and 5.
*/		 

package pramod;

class Assignment14 {
	
	void printDivisibleBySum(int startRange, int endRange) {
		int sum=0 , count=0;
		for(int index = startRange; index <= endRange; index++) {
			if(index%5==0 && index%3==0) {
				sum = sum + index;
				count++;
			}
		}
		System.out.println("In the range "+startRange+" to "+endRange+", calculated sum is "+sum);
		System.out.println("In the range "+startRange+" to "+endRange+", "+count+" numbers are divisible by 3 and 5");
	}
	
	
	public static void main(String[] args) {
		Assignment14 divsum = new Assignment14();
		divsum.printDivisibleBySum(1,70);
	}
}