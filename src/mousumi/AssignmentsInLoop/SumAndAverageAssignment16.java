package mousumi.AssignmentsInLoop;
/**
 Assignment - 16 : 22nd Jun'2024 [25 mins]
On user defined range print sum and average of first 3 numbers which is divisible by 5 & 7.

Hint : pass start and end index as a parameter.

Input : Range -> 1 to 210
Output : Numbers are,
35
70
105
Found 3 numbers which are divible by 5 & 7.
sum = 210
Average = 70


*/


	public class SumAndAverageAssignment16 {
		static void calculateSumAndAverage(int startRange, int endRange) {
		        int count = 0;   
		        int sum = 0;     
	      System.out.println("Numbers are:");
		        for (int num = startRange; num <= endRange; num++) {
		           if (num % 5 == 0 && num % 7 == 0) {
		                System.out.println(num);
		                sum += num;            
		                count++;                
		                if (count == 3) {
		                    break;
		                }
		            }
		        }
		        if (count == 3) {
		            double average = sum / 3.0; 
		            System.out.println("Found " + count + " numbers "
		            		                    + "which are divisible by 5 & 7.");
		            System.out.println("Sum = " + sum);
		            System.out.println("Average = " + average);
		        } else {
		            System.out.println("Less than 3 numbers were found in the"
		            	        	+ " given range that are divisible by 5 & 7.");
		        }
		    }
		    public static void main(String[] args) {
		        int start = 1;
		        int end = 210;
		        calculateSumAndAverage(start, end);
		    }
	 }
