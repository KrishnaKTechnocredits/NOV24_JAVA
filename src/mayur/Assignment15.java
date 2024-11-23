/*
 * Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
 */

package mayur;

public class Assignment15 {
	
	void first3NosDivCheck(int startRange, int endRange) {
		
		int count=0;
		System.out.println("In the range "+startRange+" to "+endRange+" , first 3 numbers that are divisible by 3 and 4");
		for(int startRange_local=startRange;startRange_local<=endRange;startRange_local++) {
			if (startRange_local%3==0 && startRange_local%4==0) {
				count++;
				System.out.println(startRange_local);
				if (count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assign15 = new Assignment15();
		assign15.first3NosDivCheck(10, 500);
	}

}
