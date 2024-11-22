package kishor;

public class Assignment15_Break1 {
	
	void printNumber(int startRange,int endRange) {
		int count=0;
		for(int i=startRange;i<=endRange;i++) {
			if(i%3==0 && i%4==0) {
				System.out.println(" The numbers which is divisible by 3 and 4 is :" + i);
				count++;
				if(count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment15_Break1 assignment15_break1 = new Assignment15_Break1();
		assignment15_break1.printNumber(10, 500);
	}
}
