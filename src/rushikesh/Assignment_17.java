package rushikesh;

public class Assignment_17 {

	void printReverseMethod(int startIndex,int endIndex) {
		
		int count=0;
		System.out.println("Last 5 numbers divisible by 5 is :");
		for(int num1=startIndex;num1>=endIndex;num1--) {
			if(num1%5==0) {
				System.out.println(num1);
				count++;
				if(count==5) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_17 assignment_17=new Assignment_17();
		assignment_17.printReverseMethod(500,10);
	}

}
