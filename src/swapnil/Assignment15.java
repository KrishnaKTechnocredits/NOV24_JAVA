package swapnil;

public class Assignment15 {
	int startRange, endRange;
	int num;
	int count=0;
	
	void div(int startRange,int endRange) {
		for(num = startRange;num<=endRange;num++) {
			if(num%3 == 0 && num%4 == 0) {
				count++;
				System.out.println(num);
			if(count == 3) {
			break;
			}
			
			}	
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment15 assignment15 = new Assignment15();
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		assignment15.div(10, 500);
	}

}


/*
Assignment - 15 : 22nd Nov'2024 [30-35 mins]
On user defined range print first 3 numbers which is divisible by 3 & 4.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : First 3 numbers divisible by 3 and 4 is :
12
24
36
*/