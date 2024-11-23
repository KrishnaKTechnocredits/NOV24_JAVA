package siddharth;

public class Assignment15 {
	
	void printNum(int startRange, int endRange) {
		int num = 0;
		int count = 0;
		System.out.println("Input : Range -> "+startRange+" to "+endRange);
		System.out.println("Output : First 3 numbers divisible by 3 and 4 is :");
		for(num=startRange;num<=endRange;num++) {
			if(num%3==0 && num%4==0) {
				count++;
				if(count==4) {
					break;
				}
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15 assignment15 = new Assignment15();
		assignment15.printNum(10, 500);
	}
}
