package madhura;

public class Assignment17_Last5NumbersDivBy5 {
	
	void printLast5Num(int startRange, int endRange) {
		System.out.println ("The last 5 numbers divisible by 5 : ");
		int count=0;
		for(int num=endRange; num>=startRange;num--) {
			if(num%5==0) {
				System.out.println(num);
				count++;
				if (count==5) {
					break;
				}
			}
		}
	}
	
	public static void main (String[] args) {
		Assignment17_Last5NumbersDivBy5 lastnum = new Assignment17_Last5NumbersDivBy5();
		lastnum.printLast5Num (10,500);
	}
}