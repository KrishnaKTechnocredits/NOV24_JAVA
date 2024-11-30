package nitish;

public class SumAndAvg {
	
	void inputData(int start,int end) {
		int count=0;
		int sum =0 ;
		int avg =0;
		for(int num = start;num <=end;num++) {
			if(num%5==0 && num%7==0) {
				System.out.println(num);
				sum = sum+num;
				count++;
				if(count==3) {
					avg = sum/count;
					break;

				}
			}
		}
		System.out.println("Count of the numbers divisible by 5 and 7 is "+count);
		System.out.println("Sum of the first three numbers which are divisible by are 5 and 7 is  "+sum);
		System.out.println("Average of the first three numbers which are divisible by are 5 and 7 is "+avg);
	}

	public static void main(String[] args) {
		SumAndAvg sumAndAvg = new SumAndAvg();
		System.out.println("The first three numbers which are divisible by are 5 and 7 are ");
		sumAndAvg.inputData(1, 210);

	}

}
