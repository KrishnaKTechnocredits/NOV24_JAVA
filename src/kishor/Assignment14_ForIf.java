package kishor;

public class Assignment14_ForIf {
	
	void dataCalculation(int startrange, int endrange) {
		int sum=0;
		int count=0;
		for(int num=startrange;num<=endrange;num++) {
			if(num%3==0 && num%5==0) {
				sum =sum+num;
				count++;
			}
		}
		System.out.println("In the range "+startrange+" to "+endrange+", calculated sum is "+sum);
		System.out.println("In the range "+startrange+" to "+endrange+", "+count+" numbers are divisible by 3 and 5.");
	}
	
	public static void main(String[] args) {
		Assignment14_ForIf assignment14_nested = new Assignment14_ForIf();
		assignment14_nested.dataCalculation(1, 70);
	}
}
