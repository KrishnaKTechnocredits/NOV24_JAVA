package pratiksha;

public class Assignment17 {
	/*On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480 */
	
	
	void reverseRangePrint(int startRange,int endRange) {
		 
		int count=0;
	
		System.out.println("last 5 divisible numbers are");
		
		for(int i=endRange; i>=startRange; i--){
		
			if(i % 5 == 0) {
				
				System.out.println(i);
				
				count++;
					
					if(count==5) {
						
					break;
					}
			}
		}
	}
		public static void main(String[]args) {
			Assignment17 assign17=new Assignment17();
			assign17.reverseRangePrint(10, 500);
		}


	
	}
