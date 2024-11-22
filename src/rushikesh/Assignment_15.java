package rushikesh;

public class Assignment_15 {

	void printMethod(int startIndex,int endIndex) {
		
		int count=0;
		System.out.println("First 3 numbers divisible by 3 and 4 is :");
		for (int num1=startIndex;num1<=endIndex;num1++) {
			if(num1%3==0 && num1%4==0) {
				System.out.println(num1);
				count++;
				if(count==3) {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_15 assignment_15=new Assignment_15();
		assignment_15.printMethod(10,500);
		
	}

}
