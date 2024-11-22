package ashwini;

public class SumandAvgAssignment16 {
 void sumAndAvg(int startRange,int endRange) {
	 int count=0;
	 int sum=0;
	 int avg=0;
	 System.out.println("Numbers are");
	 for(int num=startRange;num<=endRange;num++) {
		 if(num%5==0&&num%7==0) {
			 System.out.println(num);
			 count++;
			 sum=sum+num;
			 avg=sum/count;
			 if(count==3) {
				 break;
			 }
		 }
	 }
	 System.out.println("Found "+count+"numbers which are divisible by 5 & 7");
	 System.out.println("Sum=" + sum);
	 System.out.println("Average=" + avg);
 }
	public static void main(String[] args) {
		SumandAvgAssignment16 assn16=new SumandAvgAssignment16();
		assn16.sumAndAvg(1,210);

	}

}
