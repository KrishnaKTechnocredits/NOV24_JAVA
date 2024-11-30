package prajaktaS;

public class Assignment_14{
	
	void printNum(int startindex,int endindex) {
		
		int sum=0;
		int count=0;
		for (int num=startindex;num<=endindex;num++) {
			if(num%3==0 && num%5==0) {
				sum=sum+num;
				count++;
			}
		}
		System.out.println("In the range " + startindex+ " to " + endindex + " ,calculated sum is "+sum);
		System.out.println("In the range "+ startindex+ " to " + endindex +" total "+ count+" numbers are divisible by 3 and 5");
	}

	public static void main(String[] args) {
		Assignment_14 assignment14=new Assignment_14();
		assignment14.printNum(1, 70);
	}

}
