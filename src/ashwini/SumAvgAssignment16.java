package ashwini;

public class SumAvgAssignment16 {
	void sumOfNum(int startRange,int endRange) {
		int sum=0;
		int count=0;
		int avg;
		System.out.println("Numbers are ");

		for (int num=startRange;num<=endRange;num++) {
			if(num%5==0&&num%7==0) {
				System.out.println(num);
				
				System.out.println(" Found"+count+" Numbers which are divisible by 5 & 7 ");
				sum=sum + num;
				count++;
				avg= sum/count;
				System.out.println(avg);
				if(count==3) {
					break;				
				}	
			}
			}
	}
		
	public static void main(String[] args) {
		SumAvgAssignment16 Assignment16= new SumAvgAssignment16();
		Assignment16.sumOfNum(1, 210);
		}

}
