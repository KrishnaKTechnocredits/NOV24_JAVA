package prajaktaS;

public class Assignment17 {

		void bottom5Print(int startRange,int endRange) {
			int count=0;
			System.out.println("Last 5 numbers divisible by 5 is :");
			for (int num=endRange;num>=startRange;num--) {
				if (num%5==0)
				{
					System.out.println(num);
					count++;
				}
				if(count==5){
					break;
					
				}
			}
		}
		
		public static void main(String[] args) {

			Assignment17 assignmnet17=new Assignment17();
			assignmnet17.bottom5Print(10, 500);
		}

	}
