package siddharth;

public class Assignment12 {

	void evenNum(int startRange, int endRange) {
		System.out.println("Input Range is: "+startRange+" to "+endRange);
		System.out.println("Even numbers are: ");
		for(int num = startRange;num <= endRange;num++) {
			if(num%2 == 0) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment12 assignment12 = new Assignment12();
		assignment12.evenNum(10, 15);
	}
}
