package madhura;

public class Assignment16_First3Numbers16 {

	void printSumAndAverage(int startRange, int endRange) {
		System.out.println ("The 3 numbers divisible by "+startRange+ " and " +endRange+ " : ");
		int sum=0;
		int count=0;
		int avg = 0;
		for(int num=startRange; num<=endRange; num++) {
			if(num%5==0 && num%7==0) {
				System.out.println (num);
				sum=sum+num;
				count++;
				avg= sum/count;
				if (count==3) {
					break;
				}
		}
	}
		System.out.println ("Sum of 3 Numbers which are divisble by " +startRange+ " and "+endRange+ " : "+sum);
		System.out.println ("Average of 3 Numbers which are divisble by " +startRange+ " and "+endRange+ " : "+avg);
}

	public static void main (String [] args) {
		Assignment16_First3Numbers16 printnum = new Assignment16_First3Numbers16();
		printnum.printSumAndAverage(10,210);
	}
}