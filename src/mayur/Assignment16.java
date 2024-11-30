/*
 * Assignment - 16 : 22nd Jun'2024 [25 mins]
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

package mayur;

public class Assignment16 {
	
	void first3NosDivCheck(int startRange, int endRange) {
			
			int count=0;
			int sum=0;
			System.out.println("In the range "+startRange+" to "+endRange+" , first 3 numbers that are divisible by 5 and 7 are -");
			for(int startRange_local=startRange;startRange_local<=endRange;startRange_local++) {
				if (startRange_local%5==0 && startRange_local%7==0) {
					count++;
					System.out.println(startRange_local);
					sum=sum+startRange_local;					
					if (count==3) {
						System.out.println("Sum of these first "+count+" numbers is = "+sum);
						int avg = sum/count;
						System.out.println("Average of these first "+count+" numbers is = "+avg);
						break;						
					}
				}
			}
		}
	
	public static void main(String[] args) {
		Assignment16 assign16 = new Assignment16();
		assign16.first3NosDivCheck(1, 210);		
	}
}
