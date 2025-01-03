package mousumi.AssignmentsInLoop;

/**
 Assignment - 17 : 22nd Nov'2024 [20 mins]
On user defined range print last 5 numbers which is divisible by 5.

Hint : pass start and end index as a parameter.

Input : Range -> 10 to 500
Output : Last 5 numbers divisible by 5 is :
500
495
490
485
480

 */
public class Last5NumsAssignment17 {
	
		static void findLastFiveNumbers(int startRange, int endRange) {
			
		        int count = 0;
		        System.out.println("Last 5 numbers divisible by 5 are:");
		        for (int num = endRange; num >= startRange; num--) {
		            if (num % 5 == 0) {
		                System.out.println(num); 
		                count++;                
		                if (count == 5) {
		                    break;
		                }
		            }
	
          if (count < 5) {
          System.out.println("There are less than 5 numbers divisible by 5 in"
          		                                       + " the given range.");
          }
       }
   }
		    public static void main(String[] args) {
		        int start = 10;
		        int end = 500;
		        findLastFiveNumbers(start, end);
		    }
		}
