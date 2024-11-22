package fazrana;

public class FAssignment14 {
	int sum;
	int count;
	
	void sum(int startNum,int endNum) {
		int startNum1=startNum;
		for (;startNum<=endNum;startNum++) {
			if (startNum%3==0 && startNum%5==0) {
				sum=sum+startNum;
				count++;
			}
		}
		System.out.println("In the range of "+startNum1+" and "+endNum+", calculatd sum is "+sum);
		System.out.println("In the range of "+startNum1+" and "+endNum + ", "+ count +" number is divisible by 3&5");
	}
	
	public static void main(String[] args) {
		FAssignment14 fassignment14=new FAssignment14();
		fassignment14.sum(1,70);
	}
}
