package madhura;

public class Assignment14_SumOfNumDivBy3And5 {
			
		void sumOfNum(int startRange, int endRange) {
			int sum=0;
			int count=0;
			for(int num=startRange; num<=endRange; num++) {
				if(num%3==0 && num%5==0) {
				sum=sum+num;
				count++;
				}
			}
				System.out.println("In the range "+startRange+ " to " +endRange+ ", calculated sum is "+sum);
				System.out.println ("In the range "+startRange+" to " +endRange+ ", there are total "+count+" numbers which are divisible by 3 and 5");
		}
		
		public static void main (String [] args) {
			Assignment14_SumOfNumDivBy3And5 sum = new Assignment14_SumOfNumDivBy3And5();
			sum.sumOfNum(1,70);
		}
	}