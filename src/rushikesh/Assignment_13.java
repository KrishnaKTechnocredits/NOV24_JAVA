package rushikesh;

public class Assignment_13 {
	
	void methodDisplay(int startRange,int endRange) {
		System.out.println("Divisible by 5 & 3 numbers are:");
		for(int num1=startRange;num1<=endRange;num1++) {
			if(num1%5==0 && num1%3==0) {
				System.out.println(num1);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_13 assignment_13=new Assignment_13();
		assignment_13.methodDisplay(5,30);
	}

}
