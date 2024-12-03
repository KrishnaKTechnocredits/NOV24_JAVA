//Assignment - 31 : 2nd Dec'2024 [15 mins]
//
//return the difference of Sum of all the odd digits and even digits present in a given String. 
//HINT : sum of odd digits - sum of even digits
//
//input : "te1ch2no3cre7dits"
//output : 9

package fazrana.ascii;

public class FAssignment31 {
	int getDifference(String str) {
		int odd=0;
		int even=0;
		for (int i=0;i< str.length();i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch)) {
				int chVal=Character.getNumericValue(ch);
				if(chVal%2==0) {
					even=even+chVal;
				}else {
					odd=odd+chVal;
				}
			}
		}
		return odd-even;
	}
	
	public static void main(String[] args) {
		FAssignment31 fassignment31=new FAssignment31();
		int diffValue=fassignment31.getDifference("te1ch2no3cre7dits");
		System.out.println("Difference of Sum of all the odd digits and even digits is "+diffValue);
	}
}
