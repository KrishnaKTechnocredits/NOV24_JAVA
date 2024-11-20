package technocredits.loopdemo;

public class Example3 {
	
	void printOddNumbers(int startRange,int endRange) {
		System.out.println("List of odd numbers between " + startRange + " to " + endRange);
		for(int num=startRange;num<=endRange;num++) {
			if(num%2==1) {
				System.out.println(num);
			}
		}
	}
	
	void printOddNumbersInRevOrder(int endRange, int startRange) {
		System.out.println("List of odd numbers between " + startRange + " to " + endRange);
		for(int num=endRange;num>=startRange;num--) {
			if(num%2==1) {
				System.out.println(num);
			}
		}
	}
	
	public static void main(String[] args) {
		Example3 example3 = new Example3();
		example3.printOddNumbers(10,40);
		example3.printOddNumbersInRevOrder(100,10);
	}
}
