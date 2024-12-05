/*Assignment - 16 : 22nd Jun'2024 [15 mins]
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70

*/

package pramod;

class Assignment16 {
	
	void printSumAvgDivBy(int startRange, int endRange) {
		int sum = 0, avg = 0, count=0;
		System.out.println("Numbers are,");
		for(int index = startRange; index <= endRange; index++) {
			if(index%5==0 && index%7==0) {
				System.out.println(index);
				count++;
				sum = sum +index;
			}
			if(count == 3) {
				break;
			}
		}
		avg = sum / count;
		System.out.println("Fount "+count+" Numbers which are divisible by 5 & 7");
		System.out.println("Sum is: " +sum);
		System.out.println("Average is: " +avg);
	}
	
	public static void main(String[] args) {
		Assignment16 sumavg = new Assignment16();
		sumavg.printSumAvgDivBy(1,210);
	}
}