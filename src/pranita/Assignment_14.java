package pranita;

public class Assignment_14 {
	
		void printNum(int startIndex,int endIndex) {
			
			int sum=0;
			int count=0;
			for (int num=startIndex;num<=endIndex;num++) {
				if(num%3==0 && num%5==0) {
					sum=sum+num;
					count++;
				}
			}
			System.out.println("In the range " + startIndex+ " to " + endIndex + " calculated sum is "+sum);
			System.out.println("In the range "+ startIndex+ " to " + endIndex +" total "+ count+" numbers are divisible by 3 and 5 is :");
		}

		public static void main(String[] args) {
			Assignment_14 assignment14=new Assignment_14();
			assignment14.printNum(1, 70);
		}

	}


