//Assignment - 31 : 2nd Dec'2024 [15 mins]
//
//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
//
//input : "te1ch2no3cre7dits"
//output : 9
//
//input : "4563"
//output : -2

package harshada.string;

public class StringAss9 {
	
	void findSumDiffFromString(String str) {
		int evenSum=0, oddSum=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				int num=Character.getNumericValue(ch);
				if(num%2==0) {
					evenSum+=num;
				}else {
					oddSum+=num;
				}
			}
		}
		System.out.println("difference of Sum of all the odd digits and even digits present in a given String is "+(oddSum-evenSum));
	}
	
	public static void main(String[] args) {
		StringAss9 stringAss9=new StringAss9();
		stringAss9.findSumDiffFromString("te1ch2no3cre7dits");
		stringAss9.findSumDiffFromString("4563");
	}
}
