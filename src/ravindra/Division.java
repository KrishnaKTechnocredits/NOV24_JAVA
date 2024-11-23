package ravindra;

public class Division {
	void numDivision(int startIndex,int endIndex) {
		int sum=0;
		int count=0;
		for(int num=startIndex=1;num<=endIndex;num++) {
			if(num%3==0 && num%5==0) {
				sum=sum+num;
				count++;
			}
		}
		System.out.println("In the range 1 to 70, calculated sum is "+sum);
		System.out.println("In the range 1 to 70, "+count+" numbers are divisible by 3 and 5");
	}
	
	public static void main(String []args) {
		Division division=new Division();
		division.numDivision(1, 70);
	}
}
