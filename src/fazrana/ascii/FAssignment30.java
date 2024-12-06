
//Assignment - 30 : 2nd Dec'2024 [15 mins]
//
//Sum of all the even digits present in a given String. 
//
//input : "te1ch2no3cre7dits"
//output : 2
//
//input : "techno"
//output : 0
//
//input : "4563"
//output : 10

package fazrana.ascii;

public class FAssignment30 {
	int sumEven(String str) {
		int sum=0;
		for(int i=0;i< str.length();i++) {
			char ch= str.charAt(i);
			if(Character.isDigit(ch)) {
				int chValue=Character.getNumericValue(ch);
				if(chValue%2==0) {
					sum=sum+chValue;
				}
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		FAssignment30 fassignment30=new FAssignment30();
		System.out.println("Sum of even digits in te1ch2no3cre7dits are "+fassignment30.sumEven("te1ch2no3cre7dits"));
		System.out.println("Sum of even digits in techno are "+fassignment30.sumEven("techno"));
		System.out.println("Sum of even digits in 4563 are "+fassignment30.sumEven("4563"));
	}
}
