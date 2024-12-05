/*Assignment - 31 : 2nd Dec'2024 [15 mins]

return the difference of Sum of all the odd digits and even digits present in a given String. 
HINT : sum of odd digits - sum of even digits

input : "te1ch2no3cre7dits"
output : 9

input : "4563"
output : -2
*/
package pramod;
class Assignment31 {
	
	int getOddAndEvenSumDiff(String str) {
		System.out.println("Given string is: " + str);
		int evenSum=0, oddSumm=0;
		for(int i=0; i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num = Character.getNumericValue(ch);
				if(num%2==0) {
					evenSum = evenSum + num;
				}
				else {
					oddSumm = oddSumm + num;
				}
			}
		}
		int answer = 0;
		answer = oddSumm - evenSum;
		return answer;
	}
	
	public static void main(String[] args) {
		Assignment31 getDiffOddSum = new Assignment31();
		int answer = 0;
		answer = getDiffOddSum.getOddAndEvenSumDiff("te1ch2no3cre7dits");
		System.out.println("Difference of Odd and Sum numbers from given string is: " + answer);
		answer = getDiffOddSum.getOddAndEvenSumDiff("4563");
		System.out.println("Difference of Odd and Sum numbers from given string is: " + answer);
	}
}