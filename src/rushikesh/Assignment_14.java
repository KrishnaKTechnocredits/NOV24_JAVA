package rushikesh;

public class Assignment_14 {
	
	void printMethod(int startIndex, int endIndex) {
		
		int sum=0;
		int count=0;
		for(int i=startIndex;i<=endIndex;i++) {
			if(i%3==0 && i%5==0) {
				sum=sum+i;
				count++;
			}			
		}
		
		System.out.println("In the range "+startIndex+" to "+endIndex+",calculated sum is "+sum);
		System.out.println("In the range "+startIndex+" to "+endIndex+","+count+" numbers are divisible by 3 and 5.");	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_14 assignment_14=new Assignment_14();
		assignment_14.printMethod(1,70);
		}
}
