package swapnil;

public class Assignment16 {
	int num;
	int startRange,endRange;
	int count=0;
	int sum = 0;
	int Average;
	
	void div(int startRange, int endRange) {
		for(num=startRange;num<=endRange;num++) {
			if(num%5==0 && num%7==0) {
				count++;
				sum = sum + num;
				Average = sum/count;
				
			if(count == 3) {
					break;
				}
			}
		}
		    System.out.println("Sum = "+sum);
		    System.out.println("Average = "+Average);
	}

	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.div(1, 210);

	}

}





/*
Assignment - 16 : 22nd Jun'2024 [25 mins]
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