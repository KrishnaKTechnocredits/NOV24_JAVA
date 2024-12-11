package pratiksha;

public class Assignment_16 {
	
/*	On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

	Hint : pass start and end index as a parameter.

	Input : Range -> 1 to 210
	Output : Numbers are,
	35
	70
	105
	Found 3 numbers which are divible by 5 & 7.
	sum = 210
	Average = 70  */
	
	static int count;
	static int sum;
	
	int getRangeSum(int startRange, int endRange){
		
		for(int num=startRange;num<=endRange;num++) {
			
			if(num%5==0 && num%7==0) {
				
				count++;
				
				sum= sum+num;
				
				if(count>=3) {
					return sum;
				}
			}
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Assignment_16 assign16= new Assignment_16();
		int ans= assign16.getRangeSum(1, 210);
		
		int average =ans/count;
		System.out.println("sum of 3 divisible numbers by 5 & 7 are: " +ans);
		System.out.println("Average of 3 divisible numbers are :" +average);
}
}
