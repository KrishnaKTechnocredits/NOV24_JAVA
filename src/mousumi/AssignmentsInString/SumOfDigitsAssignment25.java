package mousumi.AssignmentsInString;

/**
 Assignment - 25 : 2nd Dec'2024 [20 mins]

Sum of all the digits present in a given String. 

input : "te1ch2no3cre7dits"
output : 13

input : "techno"
output : 0

input : "4563"
output : 18
 */

public class SumOfDigitsAssignment25 {
	
   private int getSumOfDigits(String str) {
	 int sum = 0;
	   for (int i = 0; i < str.length(); i++) {
		 if (Character.isDigit(str.charAt(i))) {
		  sum+= Character.getNumericValue(str.charAt(i));  
	      }
      }
        return sum;
   }   

       public static void main(String[] args) {
       
       SumOfDigitsAssignment25 Assignment25 = new SumOfDigitsAssignment25();
       String str = "te1ch2no3cre7dits";
       int sumOfDigits = Assignment25.getSumOfDigits(str);
       System.out.println("Sum of all the digits present in a given String " +
                                                   str + " is " + sumOfDigits );
       }
   }     
       
