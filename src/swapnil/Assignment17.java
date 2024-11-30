package swapnil;

public class Assignment17 {
	int startRange,endRange;
	int num;
	int count=0;
	
	void lastnum(int startRange, int endRange) {
		for(num=endRange;num>=startRange;num--) {
			if(num%5==0) {
				count++;
				System.out.println(num);
				if(count==5) {
					break;	
				}
				
			}
			
		}
		
	}

	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		System.out.println("Last 5 numbers divisible by 5 is : ");
		assignment17.lastnum(10, 500);
		

	}

}



/*
Assignment - 17 : 22nd Nov'2024 [20 mins]
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