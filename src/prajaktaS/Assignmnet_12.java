package prajaktaS;

public class Assignmnet_12 {

	void evenNum1(int startIndex,int endIndex) {
		System.out.println("Even numbers from "+startIndex+ " and " +endIndex +" are :");
		for (int num=startIndex;num<=endIndex;num++) {
			if (num%2==0) {
				System.out.println(num);
			}
		}
	}
	
	void evenNum2(int startIndex,int endIndex) {
		System.out.println("Even numbers from "+startIndex+ " and " +endIndex +" are :");
		for (;startIndex<=endIndex;startIndex++) {
			if (startIndex%2==0) {
				System.out.println(startIndex);
			}
		}
	}
		
	public static void main(String[] args) {
		Assignmnet_12 assignmnet12=new Assignmnet_12();
		assignmnet12.evenNum1(10, 15);
		assignmnet12.evenNum2(10, 15);
	}

}
