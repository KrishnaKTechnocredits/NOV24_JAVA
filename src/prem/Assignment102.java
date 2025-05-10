package prem;

public class Assignment102 {
	
	int getReverseDigit(int num) {
		int reverseNum = 0;
		while(num!=0) {
		int singleNum= num %10;
		    reverseNum = reverseNum* 10 +singleNum;
		    num =num/10;
		}
		return reverseNum;
	}
	
	public static void main(String[] args) {
		int num = 321;
		Assignment102 assign102 = new Assignment102();
		int digit = assign102.getReverseDigit(num);
		System.out.println(digit);
	}
}
