package siddharth;

public class Assignment16 {
	
	void printNum(int startRange, int endRange) {
		int num = 0;
		int count = 0;
		int sum = 0;
		int avg = 0;
		System.out.println("Input : Range -> "+startRange+" to "+endRange);
		System.out.println("Output : First 3 numbers divisible by 5 and 7 are :");
		for(num=startRange;num<=endRange;num++) {
			if(num%5==0 && num%7==0) {
				count++;
				sum = sum+num;
				avg =sum/count;
				if(count==4) {
					break;
				}
				System.out.println(num);
			}
		}
		System.out.println("Sum = "+sum);
		System.out.println("Avg = "+avg);
	}
	
	public static void main(String[] args) {
		Assignment16 assignment16 = new Assignment16();
		assignment16.printNum(1, 210);
	}
}
