package ravindra;

public class SumAndAvgThreeNum {
	void sumAndAvg(int startIndex,int endIndex) {
		System.out.println("Numbers are,");
		int sum=0;
		int avg=0;
		int count=0;
		for(int num=startIndex; num<=endIndex;num++) {
			if(num%5==0 && num%7==0) {
				count++;
				if(count<=3) {
					System.out.println(num);
					sum=sum+num;
					avg=sum/count;
				}
			}
		}System.out.println("Found 3 numbers which are divible by 5 & 7 sum is ="+sum);
		 System.out.println("Average is ="+avg);
	}
	
	public static void main(String []args) {
		SumAndAvgThreeNum sumAndAvgThreeNum=new SumAndAvgThreeNum();
		sumAndAvgThreeNum.sumAndAvg(1, 210);
	}
}