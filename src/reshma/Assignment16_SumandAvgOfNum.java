package reshma;

public class Assignment16_SumandAvgOfNum {
	void printSumOfNum(int startindex, int endindex) {
		System.out.println("first 3 numbers which is divisible by 5 & 7");
		int sum=0;
		int count=0;
		int Average=0;
		for(int num=startindex;num<=endindex; num++) {
			if(num%5==0 && num%7==0) {
				System.out.println(num);
				count++;
				sum +=num;
				Average=sum/count;
			if(count==3) {
				break;
				
				}
			}
		}
			System.out.println("Sum is " + sum);
			System.out.println("Average is " + Average);
	}
			
			public static void main(String[]args) {
				Assignment16_SumandAvgOfNum s=new Assignment16_SumandAvgOfNum();
				s.printSumOfNum(1,210);
	}
}
