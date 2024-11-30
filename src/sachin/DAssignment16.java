package sachin;

public class DAssignment16 {
	
		static int count;
		static int sum;
		
		int getRangeSum(int startRange,int endRange) {
			for(int num=startRange;num<=endRange;num++) {
				if (num%5==0 && num%7==0) {
					count++;
					sum= sum +num;
					if(count>=3) {
						return sum;
					}
				}
			}
			return 0;
		}
		
		public static void main(String[] args) {
			DAssignment16 assign16 = new DAssignment16();
			int ans= assign16.getRangeSum(1,210);
	  		int average = ans /count;
			System.out.println("sum of 3 divisible numbers by 5 & 7 are :" +ans);
			System.out.println("Average of 3 divible numbers are :"+ average);
		}

	}

