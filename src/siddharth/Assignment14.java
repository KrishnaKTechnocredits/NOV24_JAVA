package siddharth;

public class Assignment14 {
	
	void printNum(int startRange, int endRange) {
		System.out.println("Input : Range -> "+startRange+" to "+endRange);
		int sum = 0;
		int count = 0;
		for(int num = startRange;num<= endRange;num++) {
			if(num%3==0 && num%5==0) {
				sum = sum+num;
				count++;
			}
		}
		System.out.println("Output : In the range 1 to 70, calculated sum is "+sum);
		System.out.println("Output : In the range 1 to 70, "+count+" numbers are divisible by 3 & 5");
	}
	
	public static void main(String[] args) {
		Assignment14 assignment14 = new Assignment14();
		assignment14.printNum(1, 60);
	}
}
