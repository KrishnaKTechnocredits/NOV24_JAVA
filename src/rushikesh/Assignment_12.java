package rushikesh;

public class Assignment_12 {
	
	int num1;
	
	void printEvenNum(int startRange,int endRange) {
		
		System.out.println("List of Even number-");
		for(num1=startRange;num1<=endRange;num1++) {
			if(num1%2==0) {
				System.out.println(num1);
			}
		}
	}
	
	void printhOddNum(int startRange,int endRange) {
		
		int num2=startRange;
		System.out.println("List od Odd number-");
		for (;num2>endRange;num2--) {
			if (num2%2==1) {
				System.out.println(num2);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_12 assignment_12=new Assignment_12();
		assignment_12.printEvenNum(10,15);
		assignment_12.printhOddNum(100,85);
	}

}
