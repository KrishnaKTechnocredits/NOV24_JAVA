package swapnil;

public class Assignment31 {
	int diff;
		
		void getEvenOddDigitSum(String str) {
			int oddSum=0;
			int evenSum = 0;
			
	
			for(int num=0;num<str.length();num++) {
				char ch = str.charAt(num);
				if(Character.isDigit(ch)) {
					int digit = Character.getNumericValue(ch);
					if(digit%2==0) {
						evenSum=evenSum+digit;
					}
					else if(digit%2!=0) {
						
						
						oddSum=oddSum+digit;
					}
				}
			}
			diff = oddSum-evenSum;
				
		}
		public static void main(String[] args) {
			Assignment31 assignment31 = new Assignment31();
			assignment31.getEvenOddDigitSum("te1ch2no3cre7dits");
			System.out.println(assignment31.diff);
			assignment31.getEvenOddDigitSum("4563");
			System.out.println(assignment31.diff);
			}

	}

/*
 * Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2
8/
 */

