package ravindra;

public class LastNumDivisionByFive {
	void lastFiveNum(int startIndex,int endIndex) {
		int count=0;
		System.out.println("Last 5 numbers divisible by 5 is :");
		for(int num=startIndex;num>=endIndex;num--) {
			if(num%5==0) {
				count++;
				if(count<=5) {
					System.out.println(num);
				}
			}
		}
	}
	
	public static void main(String []args) {
		LastNumDivisionByFive lastNumDivisionByFive=new LastNumDivisionByFive();
		lastNumDivisionByFive.lastFiveNum(500, 10);
	}
}
