package vidya;

public class SumandAvg {

	int num1;
	int num2;
	
	void processData() {
		int sum = 0;
		int count = 0;
		int average = 0;
		for(int i = 1;i<=210;i++) {
			if(i % 5 == 0&& i % 7 == 0) {
				sum = sum+i;
				count++;
				System.out.println("In given range first three numbers divisible by 3 &5 are "+i);
				if(count == 3) {
					break;
				}
				//System.out.println("Number divisible by 3 & 5 is " +i);
			}
		}
				
				
				System.out.println("The sum of first three numbers divisible by 3 & 5 is " +sum);
				System.out.println("The average of first three numbers divisible by 3 & 5 is " +sum/count);
	}
	
	public static void main(String[] a) {
		SumandAvg sumandavg = new SumandAvg();
		sumandavg.processData();
		
	}
	
}
