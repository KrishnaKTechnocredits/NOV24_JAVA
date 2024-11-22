package kishor;

public class Assignment16_Break2 {
	
	void printData(int startRange, int endRange) {
		int count=0;
		int sum=0;
		for(int i=startRange;i<=endRange;i++) {
			if(i%5==0 && i%7==0) {
				System.out.println("The number which is divisible by 5 & 7 is:- "+i);
				count++;
				sum = sum+i;
				if(count==3) {
					break;
				}
			}
		}
		int Avg= sum/count;
		System.out.println("The sum of all three number is:- " + sum);
		System.out.println("The average of three number is:- "+ Avg);
	}
	
	public static void main(String[] args) {
		Assignment16_Break2 assignment16 = new Assignment16_Break2();
		assignment16.printData(1, 210);
	}
}
