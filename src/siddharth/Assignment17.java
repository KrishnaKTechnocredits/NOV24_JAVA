package siddharth;

public class Assignment17 {
	
	void printNum(int endRange, int startRange) {
		int num = 0;
		int count = 0;
		System.out.println("Input : Range -> "+startRange+" to "+endRange);
		System.out.println("Output : Last 5 numbers divisible by 5 are :");
		for(num=endRange;num>=startRange;num--) {
			if(num%5==0) {
				count++;
				if(count==6) {
					break;
				}
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment17 assignment17 = new Assignment17();
		assignment17.printNum(500, 10);
	}
}
